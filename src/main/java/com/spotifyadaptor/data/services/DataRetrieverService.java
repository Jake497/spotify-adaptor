package com.spotifyadaptor.data.services;

import com.spotifyadaptor.client.SpotifyDataClient;

public class DataRetrieverService<T> extends RetrieverService<T> {

    public DataRetrieverService(String BASE_PATH, SpotifyDataClient<T> client) {
        super(BASE_PATH, client);
    }
}
