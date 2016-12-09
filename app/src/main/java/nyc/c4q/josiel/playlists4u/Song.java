package nyc.c4q.josiel.playlists4u;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Song implements Serializable{ // when you implement this you can pass it as an intent extra

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("label")
    @Expose
    private Object label;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("playlist")
    @Expose
    private Object playlist;
    @SerializedName("artist_id")
    @Expose
    private String artistId;
    @SerializedName("status")
    @Expose
    private Object status;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Object playlist) {
        this.playlist = playlist;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }
}