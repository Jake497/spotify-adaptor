package com.spotifyadaptor.data.handlers.profile;

import com.spotifyadaptor.data.handlers.RequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileRequestMapper implements RequestMapper<String> {

    @Override
    public String apply(String s) {
        return s;
    }
}
