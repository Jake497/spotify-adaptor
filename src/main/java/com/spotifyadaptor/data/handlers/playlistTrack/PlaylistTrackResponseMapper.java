package com.spotifyadaptor.data.handlers.playlistTrack;

import com.spotifyadaptor.data.handlers.ResponseMapper;
import com.spotifyadaptor.data.items.mappers.RefinedTrackMapper;
import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.spotifyObjects.PlaylistTrackResponse;
import com.spotifyadaptor.data.spotifyObjects.TempPlaylistTrackResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PlaylistTrackResponseMapper implements ResponseMapper<TempPlaylistTrackResponse, List<Track>> {

    private final RefinedTrackMapper refinedTrackMapper;
    private final ObjectMapper mapper;

    @Override
    public List<Track> apply(TempPlaylistTrackResponse playlistResponse) {

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return Arrays.stream(playlistResponse
                        .getTracks()
                        .getItems()
                        .toArray(new Object[0]))
                .map(e -> mapper.convertValue(e, PlaylistTrackResponse.class))
                .map(PlaylistTrackResponse::getTrack)
                .map(refinedTrackMapper::apply)
                .collect(Collectors.toList());
    }
}
