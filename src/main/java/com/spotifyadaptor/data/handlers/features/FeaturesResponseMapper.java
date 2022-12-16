package com.spotifyadaptor.data.handlers.features;

import com.spotifyadaptor.data.handlers.ResponseMapper;
import com.spotifyadaptor.data.items.TrackFeatures;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FeaturesResponseMapper implements ResponseMapper<TrackFeatures, TrackFeatures> {
    @Override
    public TrackFeatures apply(TrackFeatures trackFeatures) {
        return trackFeatures;
    }
}
