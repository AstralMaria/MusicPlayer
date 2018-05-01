package com.example.android.musicplayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<ArtistArrayList> songs = new ArrayList<ArtistArrayList>();
        songs.add(new ArtistArrayList("Frank Sinatra", "My Way"));
        songs.add(new ArtistArrayList("Queen", "Somebody to Love"));
        songs.add(new ArtistArrayList("Queen", "Keep Yourself Alive"));
        songs.add(new ArtistArrayList("Arctic Monkeys", "Crying Lightning"));
        Log.wtf("MainActivity", "" + songs.size());
        songs.add(new ArtistArrayList("Arctic Monkeys", "Fluorescent Adolescent"));
        songs.add(new ArtistArrayList("Arctic Monkeys", "505"));
        songs.add(new ArtistArrayList("Green Day", "Paranoid"));
        songs.add(new ArtistArrayList("Green Day", "American Idiot"));




        ArtistAdapter adapter =
                new ArtistAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);
    }

}

