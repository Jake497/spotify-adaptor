package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TopTrackResponse {//Extend Default Data Response

    @JsonProperty("items")
    public List<TrackResponse> items;

    @JsonProperty("total")
    public int total;
}
