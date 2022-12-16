package com.spotifyadaptor.data.services;

import com.spotifyadaptor.data.handlers.features.FeaturesHandler;
import com.spotifyadaptor.data.items.Playlist;
import com.spotifyadaptor.data.items.TrackFeatures;
import com.spotifyadaptor.data.requests.TrackDataRequest;
import com.spotifyadaptor.data.handlers.library.LibraryHandler;
import com.spotifyadaptor.data.handlers.track.TrackHandler;
import com.spotifyadaptor.data.handlers.playlistTrack.PlaylistTrackHandler;
import com.spotifyadaptor.data.handlers.profile.ProfileHandler;
import com.spotifyadaptor.data.handlers.topTrack.TopTrackHandler;
import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.items.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataServices {

    private final ProfileHandler profileHandler;
    private final TrackHandler currentTrackHandler;
    private final TopTrackHandler topTrackHandler;
    private final PlaylistTrackHandler playlistTrackHandler;
    private final LibraryHandler libraryHandler;

    private final FeaturesHandler featuresHandler;

    public User user(String authToken){

        return profileHandler.handle(authToken);
    }
    public Track currentTrack(String authToken){

        return currentTrackHandler.handle(authToken);
    }
    public List<Track> topTracks(String authToken){

        return topTrackHandler.handle(authToken);
    }
    public List<Track> playlistTrack(String authToken){

        return playlistTrackHandler.handle(authToken);
    }
    public List<Playlist> library(String authToken){

        return libraryHandler.handle(authToken);
    }
    public TrackFeatures features(TrackDataRequest request){

        return featuresHandler.handle(request);
    }
}
