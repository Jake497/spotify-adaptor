package com.spotifyadaptor.data.services;

import com.spotifyadaptor.client.SpotifyDataClient;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RetrieverService<T> {

    protected final String BASE_PATH;
    private final SpotifyDataClient<T> client;

    public T Retrieve(String authToken, String path, Class<T> responseType) {

        return client.get(BASE_PATH + path, authToken, responseType);
    }
}
