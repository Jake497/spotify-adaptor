package com.spotifyadaptor.data.services;

/*
@Component
public class DataService {

    //HTTPClient<TempPlaylistWrapper> client = new HTTPClient<>();
    String url = "https://api.spotify.com/v1/me/playlists?limit=50";

    public Collection<Playlist> getData(String accessToken) {

        List<PlaylistResponse> playlists = CompileResponse(accessToken, url); //dataResponse.items;

        List<Playlist> returnMap = new ArrayList<>();
        for(int i = 0; i < playlists.size(); i++){
            PlaylistResponse playlistResponse = playlists.get(i);
            returnMap.add(Playlist
                    .builder()
                    .name(playlistResponse.getName())
                    .tracks(playlistResponse.getTracks().total)
                    .imageUrl(playlistResponse.getImages().get(0).url)
                    .id(playlistResponse.getId())
                    .build());
        }

        return returnMap;
    }

    public List<PlaylistResponse> CompileResponse(String token, String url){

        TempPlaylistWrapper response = SendRequest(token, url);

        List<PlaylistResponse> list = response.items;

        if(response.next != null){
            list.addAll(CompileResponse(token, response.next));
        }

        return list;
    }

    public TempPlaylistWrapper SendRequest(String token, String url){//}, Class<T> responseType) {
        /*HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.set("Content-Type","application/json");

        HttpEntity entity = new HttpEntity<>(headers);

        TempPlaylistWrapper response =
                client.get(url, entity, HttpMethod.GET, TempPlaylistWrapper.class);

        System.out.println(response);
        return response; return null;
    }
}*/
