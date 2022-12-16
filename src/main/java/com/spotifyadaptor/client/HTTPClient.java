package com.spotifyadaptor.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class HTTPClient<T> {

    //private final RestTemplate restTemplate;

    public T get(String url, HttpEntity httpEntity, HttpMethod httpMethod, Class<T> responseType){

        RestTemplate restTemplate = new RestTemplate();

        try {
            URI uri = createURL(url);

            ResponseEntity<T> response =
                    //restTemplate.postForEntity(URL, request, String.class);
                    restTemplate.exchange(uri, httpMethod, httpEntity, responseType);
            return response.getBody();
        } catch (Exception e) {
            return null;//e.getMessage();
        }
    }

    URI createURL(String url){

        return UriComponentsBuilder
                .fromHttpUrl(url)
                .build()
                .toUri();
    }
}
