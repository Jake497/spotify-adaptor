package com.spotifyadaptor.data.items;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Playlist {

    String name;
    String tracks;
    String imageUrl;
    String id;
}
