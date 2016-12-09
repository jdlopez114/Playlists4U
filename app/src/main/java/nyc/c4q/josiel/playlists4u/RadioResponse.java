package nyc.c4q.josiel.playlists4u;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RadioResponse {

    @SerializedName("playlist")
    @Expose
    private Playlist playlist;

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
