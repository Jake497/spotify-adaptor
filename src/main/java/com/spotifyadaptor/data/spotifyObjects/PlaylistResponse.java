package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PlaylistResponse {

    @JsonProperty("href")
    private String href;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("collaborative")
    private boolean collaborative;

    @JsonProperty("snapshot_id")
    private String snapshotId;
    @JsonProperty("images")
    private List<ImageResponse> images;

    @JsonProperty("tracks")
    private DataResponse<TrackResponse> tracks;
}
