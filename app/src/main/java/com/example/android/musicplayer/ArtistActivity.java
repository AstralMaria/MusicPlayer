package com.example.android.musicplayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<ArtistArrayList> by_artist = new ArrayList<ArtistArrayList>();
        by_artist.add(new ArtistArrayList("Frank Sinatra", "My Way"));
        by_artist.add(new ArtistArrayList("Queen","Somebody to Love" ));
        by_artist.add(new ArtistArrayList( "Queen","Keep Yourself Alive"));
        by_artist.add(new ArtistArrayList( "Arctic Monkeys","Crying Lightning"));
        Log.wtf("MainActivity", "" + by_artist.size());
        by_artist.add(new ArtistArrayList( "Arctic Monkeys", "Fluorescent Adolescent"));
        by_artist.add(new ArtistArrayList( "Arctic Monkeys", "505"));
        by_artist.add(new ArtistArrayList("Green Day", "Paranoid"));
        by_artist.add(new ArtistArrayList("Green Day", "American Idiot" ));




        ArtistAdapter adapter =
                new ArtistAdapter(this, by_artist);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);
    }

}

