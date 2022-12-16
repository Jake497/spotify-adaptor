package com.spotifyadaptor.authorization;

import com.spotifyadaptor.authorization.requests.AuthTokenRequest;
import com.spotifyadaptor.authorization.data.Tokens;
import com.spotifyadaptor.authorization.services.AuthTokenService;
import com.spotifyadaptor.authorization.services.LoginURLService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AuthorizationController {

    private final LoginURLService loginService;
    private final AuthTokenService authTokenService;

    @CrossOrigin
    @PostMapping("/GetAuthTokens")
    public ResponseEntity<Tokens> getAuthTokens(@RequestBody AuthTokenRequest authTokenRequest) {

        ResponseEntity<Tokens> responseEntity = ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(authTokenService.get(authTokenRequest));

        return responseEntity;
    }

    @CrossOrigin
    @PostMapping("/RefreshToken")
    public ResponseEntity<Tokens> getRefresh(@RequestBody AuthTokenRequest authTokenRequest) {

        ResponseEntity<Tokens> responseEntity = ResponseEntity
                .internalServerError()
                .contentType(MediaType.APPLICATION_JSON)
                .body(null);

        return (responseEntity);
    }

    @CrossOrigin
    @PostMapping("/GetLoginURL")
    public ResponseEntity<String> getURLLogin(){

        try {
            return  ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(loginService.get());
        }
        catch(Exception e){
            return ResponseEntity
                    .badRequest()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(e.getMessage());
        }
    }
}
