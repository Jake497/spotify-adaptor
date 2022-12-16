package com.spotifyadaptor.authorization.services;

import org.springframework.stereotype.Component;

@Component
public class ScopeCreator {

    public String createScope(){
        return "ugc-image-upload" + " " +
                        "user-read-playback-state" + " " +
                        "user-modify-playback-state" + " " +
                        "user-read-currently-playing" + " " +
                        "app-remote-control" + " " +
                        "streaming" + " " +
                        "playlist-read-private" + " " +
                        "playlist-read-collaborative" + " " +
                        "playlist-modify-private" + " " +
                        "playlist-modify-public" + " " +
                        "user-follow-modify" + " " +
                        "user-follow-read" + " " +
                        "user-read-playback-position" + " " +
                        "user-top-read" + " " +
                        "user-read-recently-played" + " " +
                        "user-library-modify" + " " +
                        "user-library-read" + " " +
                        "user-read-email" + " " +
                        "user-read-private" + " " ;
    }
}
