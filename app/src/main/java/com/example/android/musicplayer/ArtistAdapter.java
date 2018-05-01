package com.example.android.musicplayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class ArtistAdapter extends ArrayAdapter <ArtistArrayList> {
    public ArtistAdapter(Activity context, ArrayList<ArtistArrayList> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_artist, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        ArtistArrayList currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.song_artist);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songArtistTextView.setText(currentSong.getSongArtist());

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);

        songNameTextView.setText(currentSong.getSongName());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}