package com.spotifyadaptor.data.handlers.playlistTrack;

import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.handlers.DataHandler;
import com.spotifyadaptor.data.spotifyObjects.TempPlaylistTrackResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Component
@RequiredArgsConstructor
public class PlaylistTrackHandler implements DataHandler<String, TempPlaylistTrackResponse, List<Track>> {

    private final PlaylistTrackProcessor dataProcessor;
    private final PlaylistTrackResponseMapper responseMapper;
}
