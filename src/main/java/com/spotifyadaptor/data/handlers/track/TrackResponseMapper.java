package com.spotifyadaptor.data.handlers.track;

import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.handlers.ResponseMapper;
import com.spotifyadaptor.data.items.mappers.RefinedTrackMapper;
import com.spotifyadaptor.data.spotifyObjects.CurrentTrackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TrackResponseMapper implements ResponseMapper<CurrentTrackResponse, Track> {

    private final RefinedTrackMapper refinedTrackMapper;

    @Override
    public Track apply(CurrentTrackResponse response) {

        return Optional.ofNullable(response)
                        .map(CurrentTrackResponse::getItem)
                        .map(refinedTrackMapper::apply)
                        .orElse(Track
                                .builder()
                                .name("No song playing currently")
                                .build());
    }
}
