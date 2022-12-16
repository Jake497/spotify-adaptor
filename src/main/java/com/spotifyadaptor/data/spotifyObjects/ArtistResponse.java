package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ArtistResponse {

    @JsonProperty("name")
    public String name;

    @JsonProperty("id")
    public String id;

    @JsonProperty("images")
    public List<ImageResponse> images;

    @JsonProperty("genres")
    public List<String> genres;

    @JsonProperty("popularity")
    public int popularity;
}
