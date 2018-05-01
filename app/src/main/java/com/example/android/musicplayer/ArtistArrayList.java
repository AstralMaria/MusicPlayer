package com.example.android.musicplayer;
import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ArtistArrayList {


    private String mSongArtist;
    private String mSongName;

    public ArtistArrayList(String SongArtist, String SongName){
        mSongArtist = SongArtist;
        mSongName = SongName;
    }

    public String getSongArtist (){

        return mSongArtist;

    }

    public String getSongName() {

        return mSongName;
    }

}