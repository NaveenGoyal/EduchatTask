package com.example.educhattask.models;

import android.widget.ImageView;

import com.exanple.educhattask.R;

import java.util.ArrayList;



public class Group {
    private String mGroupName;
    private ImageView mImageView;

    public Group(String name, int img) {
        mGroupName = name;
    }

    public String getGroupName() {
        return mGroupName;
    }


    private static int lastContactId = 0;

    public static ArrayList<Group> createGroupsList(int numGroups) {
        ArrayList<Group> groups = new ArrayList<Group>();

        for (int i = 1; i <= numGroups; i++) {
            groups.add(new Group("Class Group  " + ++lastContactId, R.drawable.ic_group_chat_icon));
        }

        return groups;
    }
}