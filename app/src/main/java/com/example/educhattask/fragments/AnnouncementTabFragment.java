package com.example.educhattask.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.educhattask.adapters.AnnouncementAdapter;
import com.example.educhattask.models.AnnounceMent;
import com.exanple.educhattask.R;

import java.util.ArrayList;



public class AnnouncementTabFragment extends Fragment {
    ArrayList<AnnounceMent> announceMents;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.tab_fragment_annoucement, container, false);

        RecyclerView rvAnouncemnts = (RecyclerView) rootView.findViewById(R.id.announcement_list);
        // Initialize announceMents
        announceMents = AnnounceMent.createAnsmntsList(5);
        AnnouncementAdapter announcementAdapter = new AnnouncementAdapter(getActivity(), announceMents);
        rvAnouncemnts.setAdapter(announcementAdapter);
        rvAnouncemnts.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}