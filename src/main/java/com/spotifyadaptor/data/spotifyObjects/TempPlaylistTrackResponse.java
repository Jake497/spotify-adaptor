package com.spotifyadaptor.data.spotifyObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TempPlaylistTrackResponse {
    @JsonProperty("href")
    public String href;

    @JsonProperty("id")
    public String id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("description")
    public String description;

    @JsonProperty("collaborative")
    public boolean collaborative;

    @JsonProperty("images")
    public List<ImageResponse> images;

    @JsonProperty("tracks")
    public Tracks tracks;

    @Data
    public class Tracks {
        @JsonProperty("items")
        public List<Object> items;
        //public List<HashMap<String, String>> items;
        //public List<AssortedData> items;

        @JsonProperty("href")
        public String href;
    }

    @Data
    public class AssortedData {
        @JsonProperty("track")
        public String addDate;
    }

    @Data
    public class TrackData {
        //@JsonProperty("track")
        //public Track track;

        @JsonProperty("added_at")
        public String addDate;
    }

    @Data
    public class Track {
        @JsonProperty("name")
        public String name;
    }
}
