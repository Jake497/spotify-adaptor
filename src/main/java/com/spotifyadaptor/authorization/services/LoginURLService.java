package com.spotifyadaptor.authorization.services;

import com.spotifyadaptor.authorization.data.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

@RequiredArgsConstructor
public class LoginURLService {

    private final ScopeCreator scopeCreator;
    private final Client client;

    private final String AUTH_BASE_URL;
    private final String REDIRECT;

    private final String LOGIN_PATH = "authorize";
    public String get() throws MalformedURLException {

        URI uri = UriComponentsBuilder
                .fromHttpUrl(AUTH_BASE_URL)
                .pathSegment(LOGIN_PATH)
                .queryParam("response_type", "code")
                .queryParam("client_id", client.getCLIENT_ID())
                .queryParam("redirect_uri", REDIRECT)
                .queryParam("scope", scopeCreator.createScope())
                .build()
                .toUri();

        URL url = new URL(AUTH_BASE_URL + LOGIN_PATH
                    +"?"
                    + "response_type=code"
                    + "&client_id=" + client.getCLIENT_ID()
                    + "&redirect_uri=" + REDIRECT
                    + "&scope=" + scopeCreator.createScope()
            );

        System.out.println("URI and URL the same = " + uri.toString().compareTo(url.toString()));

        return uri.toString();
    }
}
