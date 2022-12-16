package com.spotifyadaptor.data.handlers.library;

import com.spotifyadaptor.data.items.Playlist;
import com.spotifyadaptor.data.spotifyObjects.PlaylistResponse;
import com.spotifyadaptor.data.handlers.ResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class LibraryResponseMapper implements ResponseMapper<List<PlaylistResponse>, List<Playlist>> {

    @Override //MAY HAVE A PROBLEM WITH ITEMS BEING CAST TO OBJECT
    public List<Playlist> apply(List<PlaylistResponse> response) {
        return response
                //.getItems()
                .stream()
                .map(e -> Playlist
                        .builder()
                        .id(e.getId())
                        .name(e.getName())
                        .tracks(e.getTracks().total)
                        .imageUrl(e.getImages().get(0).getUrl())
                        .build())
                .collect(Collectors.toList());
    }
}
