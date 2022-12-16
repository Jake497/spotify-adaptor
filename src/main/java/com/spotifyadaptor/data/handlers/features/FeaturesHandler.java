package com.spotifyadaptor.data.handlers.features;

import com.spotifyadaptor.data.handlers.DataHandler;
import com.spotifyadaptor.data.items.TrackFeatures;
import com.spotifyadaptor.data.requests.TrackDataRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class FeaturesHandler implements DataHandler<TrackDataRequest, TrackFeatures, TrackFeatures> {

    private final FeaturesProcessor dataProcessor;
    private final FeaturesResponseMapper responseMapper;
}
