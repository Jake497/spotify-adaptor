package com.spotifyadaptor.data.handlers.topTrack;

import com.spotifyadaptor.data.handlers.ResponseMapper;
import com.spotifyadaptor.data.items.mappers.RefinedTrackMapper;
import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.spotifyObjects.TopTrackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TopTrackResponseMapper implements ResponseMapper<TopTrackResponse, List<Track>> {

    private final RefinedTrackMapper refinedTrackMapper;

    @Override
    public List<Track> apply(TopTrackResponse response) {

        return response
                .getItems()
                .stream()
                .map(refinedTrackMapper::apply)
                .collect(Collectors.toList());
    }
}
