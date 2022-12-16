package com.spotifyadaptor.data.handlers.track;

import com.spotifyadaptor.data.services.DataRetrieverService;
import com.spotifyadaptor.data.handlers.DataProcessor;
import com.spotifyadaptor.data.spotifyObjects.CurrentTrackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TrackProcessor implements DataProcessor<String, CurrentTrackResponse> {

    private final DataRetrieverService<CurrentTrackResponse> dataService;
    private final String PATH = "/me/player/currently-playing";

    @Override
    public CurrentTrackResponse process(String request) {
        return dataService.Retrieve(request, PATH , CurrentTrackResponse.class);
    }
}
