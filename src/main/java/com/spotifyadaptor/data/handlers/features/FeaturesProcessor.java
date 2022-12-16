package com.spotifyadaptor.data.handlers.features;

import com.spotifyadaptor.data.handlers.DataProcessor;
import com.spotifyadaptor.data.items.TrackFeatures;
import com.spotifyadaptor.data.requests.TrackDataRequest;
import com.spotifyadaptor.data.services.DataRetrieverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FeaturesProcessor implements DataProcessor<TrackDataRequest, TrackFeatures> {

    private final DataRetrieverService<TrackFeatures> dataService;
    private final String urlPath = "/audio-features/";

    @Override
    public TrackFeatures process(TrackDataRequest request) {
        return dataService.Retrieve(
                request.getAccessToken(),
                urlPath + request.getTrackId(),
                TrackFeatures.class);
    }
}
