package nyc.c4q.josiel.playlists4u;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder> {

    // don't have to cast later on because of the <SongViewHolder>

    List<Song> songList; // control enter to create constructor

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_song, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song mySong = songList.get(position);
        holder.bind(mySong); // bind this song to the view holder
    }

    @Override
    public int getItemCount() {
        return songList.size(); // always return size
    }
}
