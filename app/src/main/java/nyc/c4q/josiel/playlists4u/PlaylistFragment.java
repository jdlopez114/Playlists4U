package nyc.c4q.josiel.playlists4u;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PlaylistFragment extends Fragment {

    RecyclerView playlistAView;
    SongAdapter songAdapter;   // need an adapter for recycler view
    List<Song> songList = new ArrayList<>(); // need a list of songs for the adapter

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_playlist, container, false);
        playlistAView = (RecyclerView) root.findViewById(R.id.playlist_a);
        playlistAView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));


        fetchPlaylist();
        return root;
    }

    private void fetchPlaylist() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.bbc.co.uk") // this is the beginning to our url
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PlaylistService service = retrofit.create(PlaylistService.class);

        Call<RadioResponse> call = service.getPlaylist();
        call.enqueue(new Callback<RadioResponse>() {
            @Override
            public void onResponse(Call<RadioResponse> call, Response<RadioResponse> response) {
                RadioResponse rr = response.body();
                Playlist ourPlaylist = rr.getPlaylist();
                songList = ourPlaylist.getA();

                songAdapter = new SongAdapter(songList);
                playlistAView.setAdapter(songAdapter);
            }

            @Override
            public void onFailure(Call<RadioResponse> call, Throwable t) {

            }
        });
    }
}
