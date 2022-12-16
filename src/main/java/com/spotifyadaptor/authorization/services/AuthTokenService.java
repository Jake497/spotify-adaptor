package com.spotifyadaptor.authorization.services;

import com.spotifyadaptor.authorization.data.Client;
import com.spotifyadaptor.authorization.requests.AuthTokenRequest;
import com.spotifyadaptor.authorization.data.Tokens;
import com.spotifyadaptor.client.HTTPClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@RequiredArgsConstructor
public class AuthTokenService {

    private final HTTPClient<Tokens> client;

    private final String AUTH_BASE_URL;
    private final String REDIRECT;
    private final Client spotifyClient;

    private final String TOKEN_PATH = "/api/token";

    public Tokens get(AuthTokenRequest authTokenRequest) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type","application/x-www-form-urlencoded");

        MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<>();
        bodyMap.add("grant_type", "authorization_code");
        bodyMap.add("code", authTokenRequest.authCode);
        bodyMap.add("redirect_uri", REDIRECT);
        bodyMap.add("client_id",spotifyClient.getCLIENT_ID());
        bodyMap.add("client_secret",spotifyClient.getCLIENT_SECRET());

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(bodyMap, headers);

        Tokens tokens = client.get(AUTH_BASE_URL + TOKEN_PATH, entity, HttpMethod.POST, Tokens.class);

        return tokens;
    }
}
