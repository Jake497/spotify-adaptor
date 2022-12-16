package com.spotifyadaptor.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpotifyDataClient<T> {

    private final HTTPClient<T> client;

    public T get(String path, String authToken, Class<T> responseType){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + authToken);
        httpHeaders.set("Content-Type","application/json");

        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);

        return client.get(path, httpEntity, HttpMethod.GET, responseType);
    }
}
