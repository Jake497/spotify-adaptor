package com.spotifyadaptor.data.handlers.profile;

import com.spotifyadaptor.data.handlers.ResponseMapper;
import com.spotifyadaptor.data.items.User;
import com.spotifyadaptor.data.spotifyObjects.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProfileResponseMapper implements ResponseMapper<UserResponse, User> {

    @Override
    public User apply(UserResponse userResponse) {

        return Optional.ofNullable(userResponse)
                .map(e -> User
                        .builder()
                        .name(e.getName())
                        .build())
                .orElse(User
                        .builder()
                        .name("Home")
                        .build());
    }
}
