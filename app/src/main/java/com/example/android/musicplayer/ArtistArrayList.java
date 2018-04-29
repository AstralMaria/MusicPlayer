package com.example.android.musicplayer;

import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ArtistArrayList {
    private ArrayAdapter artistAdapter;
    private ArrayList Music;
    private String mSongName;
    private String mSongArtist;

    public ArtistArrayList(String SongArtist, String SongName){
        mSongArtist = SongArtist;
        mSongName=SongName;

    }
    public String getSongArtist() {
        return mSongArtist;
    }

    public String getSongName (){

        return mSongName;

    }


}
