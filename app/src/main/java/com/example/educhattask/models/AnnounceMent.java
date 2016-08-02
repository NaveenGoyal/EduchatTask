package com.example.educhattask.models;


import android.widget.ImageView;

import com.exanple.educhattask.R;

import java.util.ArrayList;


public class AnnounceMent {
    private String mAnsHeader;
    private String mAnsText;
	private String mAnsTextSub;
    private String mAnsTextClass;
    private ImageView mImageView;

    public String getAnsHeader() {
        return mAnsHeader;
    }

    public String getAnsTextClass() {
        return mAnsTextClass;
    }

    public String getAnsTextSub() {
        return mAnsTextSub;
    }

    public String getAnsText() {
        return mAnsText;
    }

    public AnnounceMent(String header, String text1, String subText, String classText, int img) {
        mAnsHeader = header;
        mAnsText = text1;
        mAnsTextSub = subText;
        mAnsTextClass = classText;
    }


    private static int lastContactId = 0;

    public static ArrayList<AnnounceMent> createAnsmntsList(int numAnouncement) {
        ArrayList<AnnounceMent> announceMents = new ArrayList<AnnounceMent>();

        for (int i = 1; i <= numAnouncement; i++) {
            if(i%2==0) {
                announceMents.add(new AnnounceMent("Exam Announcemet  " + ++lastContactId, "Text goes here for the next line, will come dyanamically ", "Deadline: 16 April 2016, 11:00am", "All Classes", R.id.anouncement_img));
            } else{
                announceMents.add(new AnnounceMent("General Announcemet  " + ++lastContactId, "Odd text will goes here for the next line, or other view can also inflate ", "Deadline: 11 March 2016, 4:00pm", "8A 8B 8C",  R.id.anouncement_img));

            }
        }

        return announceMents;
    }
}