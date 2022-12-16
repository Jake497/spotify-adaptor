package com.spotifyadaptor.authorization.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tokens {

    @JsonProperty("access_token")
    public String accessToken;

    @JsonProperty("token_type")
    public String tokenType;

    @JsonProperty("expires_in")
    public String expiresIn;

    @JsonProperty("refresh_token")
    public String refreshToken;
}
