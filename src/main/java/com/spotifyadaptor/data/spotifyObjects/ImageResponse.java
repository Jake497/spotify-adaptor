package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImageResponse {

    @JsonProperty("url")
    public String url;

    @JsonProperty("height")
    public int height;

    @JsonProperty("width")
    public int width;
}
