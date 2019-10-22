package com.example.tabbedproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Map;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder>{

    private Context context;
    private ArrayList<Map<String,Integer>> data;
    private LayoutInflater layoutInflater;

    public SongAdapter(Context context, ArrayList<Map<String, Integer>> data) {
        this.context = context;
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        SongViewHolder songViewHolder = new SongViewHolder(view);
        return songViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Map<String,Integer> currentElement = data.get(position);
        holder.songImage.setImageDrawable(context.getResources().getDrawable(currentElement.get("songImage"),null));
        holder.songName.setText(currentElement.get("songName"));
        holder.songDuration.setText(currentElement.get("songDuration"));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView songName;
        private TextView songDuration;
        private ImageView songImage;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);

            songName = itemView.findViewById(R.id.song_name);
            songDuration = itemView.findViewById(R.id.song_duration);
            songImage = itemView.findViewById(R.id.song_image);
        }
    }
}
