package com.spotifyadaptor.data.spotifyObjects;

import lombok.Data;

@Data
public class PlaylistTrackResponse {

    private String added_at;

    private TrackResponse track;
}
