package com.spotifyadaptor.authorization.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthTokenRequest {

    @JsonProperty("code")
    public String authCode;

    @JsonProperty("refresh")
    public String refreshToken;
}
