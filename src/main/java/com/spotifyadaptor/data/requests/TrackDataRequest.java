package com.spotifyadaptor.data.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackDataRequest extends StandardRequest {

    @JsonProperty("item")
    private String trackId;
}
