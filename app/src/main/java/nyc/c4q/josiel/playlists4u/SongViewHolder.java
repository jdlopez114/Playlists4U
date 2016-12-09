package nyc.c4q.josiel.playlists4u;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SongViewHolder extends RecyclerView.ViewHolder{

    TextView artistNameView;
    TextView songTitleView;
    private Song song;

    public SongViewHolder(View itemView) { // find the views here

        super(itemView);
        artistNameView = (TextView) itemView.findViewById(R.id.song_artist);
        songTitleView = (TextView) itemView.findViewById(R.id.song_artist);

        final Context context = itemView.getContext();

        itemView.setOnClickListener(new View.OnClickListener() { // if you want to go to another activity
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("Song", song);
                context.startActivity(intent);
            }
        });
    }

    public void bind (Song song){ // set values that you need for each item
        this.song = song;
        artistNameView.setText(song.getArtist());
        songTitleView.setText(song.getTitle());
    }
}
