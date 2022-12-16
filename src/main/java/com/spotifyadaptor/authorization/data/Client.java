package com.spotifyadaptor.authorization.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Client {

    private final String CLIENT_ID;
    private final String CLIENT_SECRET;
}
