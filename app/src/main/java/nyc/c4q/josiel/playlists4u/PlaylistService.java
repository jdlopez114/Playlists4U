package nyc.c4q.josiel.playlists4u;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlaylistService {

    @GET("/radio1/playlist.json")
    Call<RadioResponse> getPlaylist();
}
