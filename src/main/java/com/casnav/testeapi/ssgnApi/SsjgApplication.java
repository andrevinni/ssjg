package com.casnav.testeapi.ssgnApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsjgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsjgApplication.class, args);
	}

}

```
# Url de redirecionamento
VITE_LOGIN_URL_DEV= https://sso.score.ctim.mb:9000/realms/score2-dev/account
VITE_LOGIN_URL_PROD=https://login.empresa.com.br/sso?redirect_url=https://sistema.empresa.com.br/callback
VITE_SSO_BASE_URL=https://sso.batatinha.com.br:3000
VITE_OIDC_REALM=score2-dev
VITE_OIDC_CLIENT_ID=app-ssjg
VITE_OIDC_REDIRECT_URI=http://localhost:5173/callback

# Define o ambiente ativo
VITE_ENV=developement

VITE_APP_VERSAO=$npm_package_version

VITE_APP_OAUTH2_URL= https://sso.score.ctim.mb:9000/realms/score2-dev 
VITE_APP_OAUTH2_CLIENT_ID=app-ssjg
VITE_APP_OAUTH2_CLIENT_SECRET=mSHgJZG5NSI472axSmDs3KJTQnCPM6A9

VITE_APP_API_BASEURL=http://10.5.115.46:8081/login/getAuthorities
```