package com.casnav.testeapi.ssgnApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsjgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsjgApplication.class, args);
	}

}


``` proxy=http://07972427755:SENHA@proxy-1dn.mb.6060
https-proxy=http://07972427755:SENHA@proxy-1dn.mb.6060/
noproxy=.mb
registry=http://nexus.casnav.mb:8081/repository/npm-group
;@casnav-avantis:registry=http://nexus.casnav.mb:8081/repository/avantis-npm
@casnav-avantis:registry=http://nexus.casnav.mb:8081/repository/npm-casnav

//nexus.casnav.mb:8081/repository/:_authToken=NpmToken.a2f86159-08d3-30bc-80ce-03b71b2ba5f0 ````

