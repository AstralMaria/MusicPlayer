package com.example.android.musicplayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<SongArrayList> songs = new ArrayList<SongArrayList>();
        songs.add(new SongArrayList("My Way", "Frank Sinatra"));
        songs.add(new SongArrayList("Somebody to Love", "Queen"));
        songs.add(new SongArrayList("Keep Yourself Alive", "Queen"));
        songs.add(new SongArrayList("Crying Lightning", "Arctic Monkeys"));
        Log.wtf("MainActivity", "" + songs.size());
        songs.add(new SongArrayList("Fluorescent Adolescent", "Arctic Monkeys"));
        songs.add(new SongArrayList("505", "Arctic Monkeys"));
        songs.add(new SongArrayList("Paranoid", "Green Day"));
        songs.add(new SongArrayList("American Idiot", "Green Day"));




        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);
    }

}

