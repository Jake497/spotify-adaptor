package com.spotifyadaptor.config;

import com.spotifyadaptor.authorization.data.Client;
import com.spotifyadaptor.authorization.data.Tokens;
import com.spotifyadaptor.authorization.services.AuthTokenService;
import com.spotifyadaptor.authorization.services.LoginURLService;
import com.spotifyadaptor.authorization.services.ScopeCreator;
import com.spotifyadaptor.client.HTTPClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorizationConfiguration {

    @Bean
    AuthTokenService authTokenService(
            @Value("${spotify.auth.url}")
            String baseURL,
            @Value("${redirect.url}")
            String redirectURL,
            HTTPClient<Tokens> client,
            Client spotifyClient
    ){

        return new AuthTokenService(
                client,
                baseURL,
                redirectURL,
                spotifyClient
        );
    }

    @Bean
    LoginURLService loginURLService(
            @Value("${spotify.auth.url}")
            String baseURL,
            @Value("${redirect.url}")
            String redirectURL,
            ScopeCreator scopeCreator,
            Client client
    ){

        return new LoginURLService(
                scopeCreator,
                client,
                baseURL,
                redirectURL
                );
    }

    @Bean
    Client client(
            @Value("${client.id}")
            String clientID,
            @Value("${client.secret}")
            String clientSecret
    ){

        return new Client(clientID, clientSecret);
    }
}
