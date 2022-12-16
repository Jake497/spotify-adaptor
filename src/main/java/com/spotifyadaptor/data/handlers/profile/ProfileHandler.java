package com.spotifyadaptor.data.handlers.profile;

import com.spotifyadaptor.data.handlers.DataHandler;
import com.spotifyadaptor.data.items.User;
import com.spotifyadaptor.data.spotifyObjects.UserResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class ProfileHandler implements DataHandler<String, UserResponse, User> {

    private final ProfileProcessor dataProcessor;
    private final ProfileRequestMapper requestMapper;
    private final ProfileResponseMapper responseMapper;

}
