package com.spotifyadaptor.data.services;

import com.spotifyadaptor.data.spotifyObjects.SpfyObjCollection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
public class CollectionConcatenationService<T extends SpfyObjCollection, R> {

    private final RetrieverService<T> dataRetriever;

    private final String BASE_URL_CHANGEME = "https://api.spotify.com/v1";

    public List<R> ConcatenateRetrieval(String authToken, String path, Class<T> responseType){

        /*T response = dataRetriever.Retrieve(authToken, BASE_URL_CHANGEME + path, responseType);

        List<Object> list = response.getItems();

        if(response.getNext() != null){
            list.addAll(ConcatenateRetrieval(authToken, response.getNext(), responseType).getItems());
        }*/

        return getItems(authToken, BASE_URL_CHANGEME + path, responseType);
    }

    public List<R> getItems(String authToken, String path, Class<T> responseType) {
        T response = dataRetriever.Retrieve(authToken, path, responseType);
        return StringUtils.hasLength(response.getNext()) ?
                Stream.concat(response.getItems().stream(),
                        getItems(authToken,
                                response.getNext(),
                                responseType)
                                .stream())
                        .toList() :
                response.getItems();
    }
}
