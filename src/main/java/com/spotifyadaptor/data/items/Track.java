package com.spotifyadaptor.data.items;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Track {

    private String name;
    private String id;
    private String artist;
    private String album;
    private String albumImage;
}
