package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrentTrackResponse {

    @JsonProperty("item")
    public TrackResponse item;
}
