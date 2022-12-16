package com.spotifyadaptor.data.handlers.playlistTrack;

import com.spotifyadaptor.data.services.DataRetrieverService;
import com.spotifyadaptor.data.handlers.DataProcessor;
import com.spotifyadaptor.data.spotifyObjects.TempPlaylistTrackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlaylistTrackProcessor implements DataProcessor<String, TempPlaylistTrackResponse> {

    private final DataRetrieverService<TempPlaylistTrackResponse> dataService;
    private final String PATH = "/playlists/6WT3fbqanVmdxEGeljfMCQ";//tracks";

    @Override
    public TempPlaylistTrackResponse process(String request) {
        return dataService.Retrieve(request, PATH , TempPlaylistTrackResponse.class);
    }
}
