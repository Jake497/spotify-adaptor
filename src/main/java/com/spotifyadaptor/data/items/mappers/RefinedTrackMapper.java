package com.spotifyadaptor.data.items.mappers;

import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.spotifyObjects.AlbumResponse;
import com.spotifyadaptor.data.spotifyObjects.TrackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RefinedTrackMapper {

    public Track apply(TrackResponse response){

        AlbumResponse album = response.getAlbum();

        return Track
                .builder()
                .name(response.getName())
                .id(response.getId())
                .artist(response.getArtist().get(0).getName())
                .album(album.getName())
                .albumImage(album.getImages().get(0).getUrl())
                .build();
    }
}
