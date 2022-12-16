package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SpfyObjCollection<T> {

    @JsonProperty("items")
    public List<T> items;

    @JsonProperty("href")
    private String href;

    @JsonProperty("limit")
    private String limit;

    @JsonProperty("next")
    private String next;

    @JsonProperty("offset")
    private String offset;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("total")
    private String total;
}
