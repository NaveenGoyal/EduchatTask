package com.example.educhattask.models;

import android.widget.ImageView;

import com.exanple.educhattask.R;

import java.util.ArrayList;


public class Contact {
    private String mName;
    private String mDetails;
    private ImageView mImageView;

    public Contact(String name, String details, int img) {
        mName = name;
        mDetails = details;

    }

    public String getName() {
        return mName;
    }

    public String getDeatils() {
        return mDetails;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Mr. Teacher  " + ++lastContactId, "Teacher at Global Shiksha Pvt. Ltd", R.id.avatar_img));
        }

        return contacts;
    }
}