package com.spotifyadaptor.config;

import com.spotifyadaptor.client.SpotifyDataClient;
import com.spotifyadaptor.data.services.DataRetrieverService;
import com.spotifyadaptor.data.services.RetrieverService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RetrieverConfiguration {

    @Bean
    @Primary
    RetrieverService<?> RetrieverService(@Value("${spotify.base.url}")
                                         String basePath,
                                         SpotifyDataClient<?> client){

        return new RetrieverService<>(basePath,
                client);
    }

    @Bean
    DataRetrieverService<?> DataRetrieverService(@Value("${spotify.data.url}")
                                             String dataPath,
                                                 SpotifyDataClient<?> dataClient){

        return new DataRetrieverService<>(dataPath,
                dataClient);
    }
}
