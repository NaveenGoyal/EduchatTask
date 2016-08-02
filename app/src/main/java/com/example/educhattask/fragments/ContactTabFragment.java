package com.example.educhattask.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.educhattask.adapters.ContactsAdapter;
import com.example.educhattask.adapters.GroupsAdapter;
import com.example.educhattask.models.Contact;
import com.example.educhattask.models.Group;
import com.exanple.educhattask.R;

import java.util.ArrayList;



public class ContactTabFragment extends Fragment {
    ArrayList<Contact> contacts;
    ArrayList<Group> groups;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.tab_fragment_contacts, container, false);

        RecyclerView rvContacts = (RecyclerView) rootView.findViewById(R.id.recent_chat_list);

        ImageView imgView = (ImageView)rootView.findViewById(R.id.avatar_img);
        imgView.setImageResource(R.drawable.ic_educhat_icon);

        // Initialize contacts
        contacts = Contact.createContactsList(3);
        // Create adapter passing in the sample user data
        ContactsAdapter contactAdapter = new ContactsAdapter(getActivity(), contacts);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(contactAdapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerView rvGroups = (RecyclerView) rootView.findViewById(R.id.group_list);
        // Initialize groups
        groups = Group.createGroupsList(2);
        GroupsAdapter groupsAdapter = new GroupsAdapter(getActivity(), groups);
        rvGroups.setAdapter(groupsAdapter);
        rvGroups.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}