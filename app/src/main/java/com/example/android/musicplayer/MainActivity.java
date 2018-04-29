package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Set the content of the activity to use the activity_main.xml layout file
            setContentView(R.layout.activity_main);
            ArrayList<SongAdapter> songs = new ArrayList<>();
            // Find the View that shows the numbers category
            TextView songOption = findViewById(R.id.songs);

// Set a click listener on that View
            songOption.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                    startActivity(songsIntent);
                }

            });

        setContentView(R.layout.activity_main);
        songs = new ArrayList<>();
        // Find the View that shows the numbers category
        TextView artistOption = findViewById(R.id.artists);

// Set a click listener on that View
        artistOption.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }

        });

    }

}