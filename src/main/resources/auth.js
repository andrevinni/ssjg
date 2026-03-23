import axios from 'axios';
import Cookies from 'js-cookie';

// ✅ Sempre usa proxy — NUNCA o IP direto
const AUTH_PREFIX = '/ssjg-auth/api/v1';

const getAccessToken = () => Cookies.get('access_token');

const saveTokens = (data) => {
  Cookies.set('access_token', data.accessToken, { expires: 7, sameSite: 'strict' });
  if (data.refreshToken) {
    Cookies.set('refresh_token', data.refreshToken, { expires: 7, sameSite: 'strict' });
  }
  if (data.expiresIn) {
    localStorage.setItem('token_expires_at', Date.now() + data.expiresIn * 1000);
  }
};

const clearTokens = () => {
  Cookies.remove('access_token');
  Cookies.remove('refresh_token');
  localStorage.removeItem('token_expires_at');
};

const isTokenValid = () => {
  const expiresAt = localStorage.getItem('token_expires_at');
  if (!expiresAt) return false;
  return Date.now() < Number(expiresAt);
};

export const authService = {

  async login(username, password) {
    const clientId = import.meta.env.VITE_APP_OAUTH2_CLIENT_ID || 'app-ssjg';
    const clientSecret = import.meta.env.VITE_APP_OAUTH2_CLIENT_SECRET;

    console.log('📡 Login em:', `${AUTH_PREFIX}/login/authenticate`);

    const response = await axios.post(`${AUTH_PREFIX}/login/authenticate`, {
      username,
      password,
      client_id: clientId,
      client_secret: clientSecret
    });

    const data = response.data;
    if (!data?.accessToken) throw new Error('Token não recebido');

    saveTokens(data);
    console.log('✅ Login OK');
    return data;
  },

  async getAuthorities() {
    const token = getAccessToken();
    if (!token) throw new Error('Sem token — faça login primeiro');

    console.log('📡 getAuthorities em:', `${AUTH_PREFIX}/login/getAuthorities`);

    const response = await axios.get(`${AUTH_PREFIX}/login/getAuthorities`, {
      headers: {
        Authorization: `Bearer ${token}`,
        Accept: '*/*'
      }
    });

    console.log('✅ Authorities:', response.data);
    return response.data || {};
  },

  async refreshToken() {
    const refreshToken = Cookies.get('refresh_token');
    if (!refreshToken) throw new Error('Refresh token não encontrado');

    const response = await axios.post(`${AUTH_PREFIX}/refresh-token`, { refreshToken });
    if (response.data?.accessToken) saveTokens(response.data);
    return response.data;
  },

  logout() {
    clearTokens();
    window.location.href = '/';
  },

  isAuthenticated: () => !!getAccessToken() && isTokenValid(),
  getAccessToken,
};
