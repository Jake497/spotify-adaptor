package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class TrackResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("artists")
    private List<ArtistResponse> artist;

    @JsonProperty("album")
    private AlbumResponse album;

    public List<String> getArtistNames(){
        return(Arrays.asList("PitBull" ));
    }
}
