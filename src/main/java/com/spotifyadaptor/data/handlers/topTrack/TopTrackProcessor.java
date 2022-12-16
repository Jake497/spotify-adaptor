package com.spotifyadaptor.data.handlers.topTrack;

import com.spotifyadaptor.data.handlers.DataProcessor;
import com.spotifyadaptor.data.services.DataRetrieverService;
import com.spotifyadaptor.data.spotifyObjects.TopTrackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TopTrackProcessor implements DataProcessor<String, TopTrackResponse> {

    private final DataRetrieverService<TopTrackResponse> dataService;
    private final String urlPath = "/me/top/tracks";

    @Override
    public TopTrackResponse process(String request) {
        return dataService.Retrieve(request, urlPath , TopTrackResponse.class);
    }
}
