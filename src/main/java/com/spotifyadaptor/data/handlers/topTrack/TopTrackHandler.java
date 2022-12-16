package com.spotifyadaptor.data.handlers.topTrack;

import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.spotifyObjects.TopTrackResponse;
import com.spotifyadaptor.data.handlers.DataHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Component
@RequiredArgsConstructor
public class TopTrackHandler implements DataHandler<String, TopTrackResponse, List<Track>> {

    private final TopTrackProcessor dataProcessor;
    private final TopTrackResponseMapper responseMapper;
}
