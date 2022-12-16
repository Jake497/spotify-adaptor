package com.spotifyadaptor.data.handlers.library;

import com.spotifyadaptor.data.services.CollectionConcatenationService;
import com.spotifyadaptor.data.spotifyObjects.PlaylistCollectionSpfyObj;
import com.spotifyadaptor.data.spotifyObjects.PlaylistResponse;
import com.spotifyadaptor.data.handlers.DataProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LibraryProcessor implements DataProcessor<String, List<PlaylistResponse>> {

    private final CollectionConcatenationService<PlaylistCollectionSpfyObj, PlaylistResponse> dataService;
    private final String PATH = "/me/playlists";

    @Override
    public List<PlaylistResponse> process(String request) {
        return dataService.ConcatenateRetrieval(request, PATH , PlaylistCollectionSpfyObj.class);
    }
}
