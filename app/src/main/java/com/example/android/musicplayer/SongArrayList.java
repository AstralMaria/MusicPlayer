package com.example.android.musicplayer;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class SongArrayList {
    private ArrayAdapter songAdapter;
    private ArrayList Music;
    private String mSongName;
    private String mSongArtist;

    public SongArrayList(String SongName, String SongArtist){
        mSongName=SongName;
        mSongArtist=SongArtist;
    }

    public String getSongName (){

        return mSongName;

    }
    public String getSongArtist (){
        return  mSongArtist;
    }



}
