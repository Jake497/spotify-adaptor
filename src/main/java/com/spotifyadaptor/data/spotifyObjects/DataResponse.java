package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DataResponse<T> {
    @JsonProperty("href")
   public String href;
 //Replace with DataResponse List that is inherited by playlist and tracks
    @JsonProperty("items")
    public List<T> items;

    @JsonProperty("limit")
    public String limit;

    @JsonProperty("next")
    public String next;

    @JsonProperty("offset")
    public String offset;

    @JsonProperty("previous")
    public String previous;

    @JsonProperty("total")
    public String total;
}
