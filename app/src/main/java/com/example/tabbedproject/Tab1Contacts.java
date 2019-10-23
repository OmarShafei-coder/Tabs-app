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


    private RecyclerView recyclerView;
    private SongAdapter adapter;
    private ArrayList<Module> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_contacts, container, false);

        recyclerView = rootView.findViewById(R.id.recycler_view);

        for(int i=0; i<10; i++){
            data.add(new Module(R.string.omar, R.string.duration, R.drawable.song));
        }

        adapter = new SongAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }
}
