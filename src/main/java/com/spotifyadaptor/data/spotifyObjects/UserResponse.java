package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserResponse {

    @JsonProperty("id")
    public String id;

    @JsonProperty("display_name")
    public String name;

    @JsonProperty("email")
    public String email;

    @JsonProperty("images")
    public List<ImageResponse> images;
}
