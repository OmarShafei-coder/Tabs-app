package com.example.tabbedproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tab1Contacts extends Fragment {

    private ArrayList<Map<String,Integer>> data;
    private RecyclerView recyclerView;
    private SongAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_contacts, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_view);
        data = new ArrayList<>();
        adapter = new SongAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final int[] songName = new int[]{
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar,
                R.string.omar
        };

        final int[] songDuration = new int[]{
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration,
                R.string.duration
        };

        final int[] songImage = new int[]{
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song,
                R.drawable.song
        };

        Map<String,Integer> temp = new HashMap<>();
        for (int i=0; i<songName.length; i++){
            temp.put("songName", songName[i]);
            temp.put("songDuration", songDuration[i]);
            temp.put("songImage", songImage[i]);
            data.add(temp);
        }

        adapter.notifyDataSetChanged();

        return rootView;
    }
}
