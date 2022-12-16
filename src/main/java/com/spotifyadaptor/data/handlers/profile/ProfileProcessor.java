package com.spotifyadaptor.data.handlers.profile;

import com.spotifyadaptor.data.handlers.DataProcessor;
import com.spotifyadaptor.data.services.DataRetrieverService;
import com.spotifyadaptor.data.spotifyObjects.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileProcessor implements DataProcessor<String, UserResponse> {

    private final DataRetrieverService<UserResponse> dataService;
    private final String urlPath = "/me";
    @Override
    public UserResponse process(String request) {
        return dataService.Retrieve(request, urlPath , UserResponse.class);
    }
}
