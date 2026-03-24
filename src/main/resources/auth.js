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



const autenticar = async () => {
  try {
    await authService.login(username, password);
    await authService.getAuthorities();
    navigate('/home');
  } catch (err) {
    console.error('❌ Erro no login:', err);
  }
};


///login

import { useEffect, useState } from 'react';
import { useNavigate } from "react-router-dom";
import { authService } from '../services/authService';
import HandleLogin from './HandleLogin';
import Loading from '../components/Loading/Loading';

const Login = () => {
  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);
  const [errorMessage, setErrorMessage] = useState(null);

  // Se já está autenticado, redireciona direto
  useEffect(() => {
    if (authService.isAuthenticated()) {
      navigate('/home', { replace: true });
    }
  }, [navigate]);

  const handleLogin = async () => {
    setLoading(true);
    setErrorMessage(null);

    try {
      // 1. Faz login e salva tokens
      await authService.login();

      // 2. Busca authorities
      await authService.getAuthorities();

      // 3. Redireciona
      navigate('/home', { replace: true });

    } catch (err) {
      console.error('❌ Erro no login:', err);
      setErrorMessage('Erro na autenticação. Verifique suas credenciais.');
      authService.logout();
    } finally {
      setLoading(false);
    }
  };

  if (loading) {
    return <Loading fullScreen message="Validando acesso com o servidor…" />;
  }

  return (
    <div>
      {errorMessage && (
        <div className="error-card">{errorMessage}</div>
      )}
      <HandleLogin onLogin={handleLogin} errorMessage={errorMessage} />
    </div>
  );
};

export default Login;




