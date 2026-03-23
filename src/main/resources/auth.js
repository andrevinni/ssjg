import axios from "axios";
import { getAccessToken } from "./tokenService";

export const autenticateUserLogin = () => {
  const isMock = import.meta.env.VITE_APP_USE_MOCK_AUTH === 'true';
  console.log("🔐 autenticateUserLogin - Modo mock:", isMock);

  const token = getAccessToken();

  if (!token) {
    console.error("❌ Nenhum token encontrado");
    return Promise.reject(new Error("Sem token"));
  }

  // ✅ Sempre usa o proxy — nunca o IP direto
  const url = '/ssjg-auth/api/v1/login/getAuthorities';
  console.log("📡 Chamando:", url);

  return axios.get(url, {
    headers: {
      Authorization: `Bearer ${token}`,
      Accept: "*/*"
    }
  })
  .then(resp => {
    console.log("✅ Authorities:", resp.data);
    return resp.data || {};
  })
  .catch(err => {
    console.error("❌ Erro Axios:", err.response || err);
    throw err;
  });
};
