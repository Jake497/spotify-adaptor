package com.spotifyadaptor.data;

import com.spotifyadaptor.data.items.TrackFeatures;
import com.spotifyadaptor.data.requests.TrackDataRequest;
import com.spotifyadaptor.data.handlers.Handler;
import com.spotifyadaptor.data.items.Playlist;
import com.spotifyadaptor.data.items.Track;
import com.spotifyadaptor.data.items.User;
import com.spotifyadaptor.data.services.DataServices;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class DataController {
    private final DataServices dataServices;

    @CrossOrigin
    @PostMapping(path = "/username", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUsername(@RequestBody String accessToken){

        User response = call(dataServices::user, accessToken, accessToken);

        return ResponseEntity.ok(response);
    }

    @CrossOrigin
    @PostMapping(path = "/currentTrack", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Track> getCurrentTrack(@RequestBody String accessToken){

        Track response = call(dataServices::currentTrack, accessToken, accessToken);

        return ResponseEntity.ok(response);
    }

    @CrossOrigin
    @PostMapping(path = "/top/{type}/{term}/{tracks}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Track>> getTop(
            @RequestBody String accessToken,
            @PathVariable String type,
            @PathVariable String term,
            @PathVariable String tracks){

        System.out.println(type + term+ tracks);

        List<Track> response = call(dataServices::topTracks, accessToken, accessToken);

        return ResponseEntity.ok(response);
    }

    @CrossOrigin
    @PostMapping(path = "/playlistTracks/{playlistId}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Track>> getPlaylistTracks(
            @NonNull @RequestBody @Validated String accessToken,
            @PathVariable String playlistId){

        List<Track> response = call(dataServices::playlistTrack, accessToken, accessToken);

        return ResponseEntity.ok(response);
    }

    @CrossOrigin
    @PostMapping(path = "/getLibrary", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Playlist>> getLibrary(@RequestBody String accessToken){

        List<Playlist> response = call(dataServices::library, accessToken, accessToken);

        return ResponseEntity.ok(response);
    }

    @CrossOrigin
    @PostMapping(path = "/trackData", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TrackFeatures> getTrackData(@RequestBody TrackDataRequest request){

        System.out.println("request" + request.getTrackId());
        TrackFeatures response = call(dataServices::features, request);

        System.out.println("response ac " + response.getAcousticness());

        return ResponseEntity.ok(response);
    }

/*
    @CrossOrigin
    @PostMapping(path = "/getLibrary", produces= MediaType.APPLICATION_JSON_VALUE)
    //public ResponseEntity<Collection<String>> getData(){
    public ResponseEntity<Collection<CuratedData>> getLibrary(@RequestBody String accessToken){

        if(accessToken.equals("test")){
            System.out.println("test apparently " + accessToken.equals("test"));
            List<CuratedData> returnMap = new ArrayList<>();
            for(int i = 0; i < 2; i++){
                returnMap.add(CuratedData
                        .builder()
                        .name("Name " + i)
                        .tracks(i*5+"")
                        .build());
            }

            return ResponseEntity.ok(returnMap);
        }
        Collection<CuratedData> returnMap = dataService.getData(accessToken);

        System.out.println(returnMap);

        return ResponseEntity.ok(returnMap);
        //return new ResponseEntity<Object>(returnMap, HttpStatus.OK);//"output";//returnMap;
    }*/

    private <T,R> R call(
            Handler<T,R> handler,
            T request
    ){

        R response = handler.handle(request);
        return response;
    }

    private <T,R> R call(
            Handler<T,R> handler,
            String token,
            T request
    ){

        R response = handler.handle(request);
        return response;
    }

}
