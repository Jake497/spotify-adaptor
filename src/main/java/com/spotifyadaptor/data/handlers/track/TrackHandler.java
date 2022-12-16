package com.spotifyadaptor.data.handlers.track;

import com.spotifyadaptor.data.handlers.DataHandler;
import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.spotifyObjects.CurrentTrackResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class TrackHandler implements DataHandler<String, CurrentTrackResponse, Track> {

    private final TrackProcessor dataProcessor;
    private final TrackResponseMapper responseMapper;
}
