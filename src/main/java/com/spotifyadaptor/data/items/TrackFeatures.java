package com.spotifyadaptor.data.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackFeatures {

    @JsonProperty("acousticness")
    private float acousticness;

    private float danceability;

    private float energy;

    private float instrumentalness;

    private float liveness;

    private float tempo;

    private float valence;
}
