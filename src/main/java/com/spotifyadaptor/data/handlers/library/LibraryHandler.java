package com.spotifyadaptor.data.handlers.library;

import com.spotifyadaptor.data.items.Playlist;
import com.spotifyadaptor.data.spotifyObjects.PlaylistResponse;
import com.spotifyadaptor.data.handlers.DataHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Component
@RequiredArgsConstructor
public class LibraryHandler implements DataHandler<String, List<PlaylistResponse>, List<Playlist>> {

    private final LibraryProcessor dataProcessor;
    private final LibraryResponseMapper responseMapper;
}
