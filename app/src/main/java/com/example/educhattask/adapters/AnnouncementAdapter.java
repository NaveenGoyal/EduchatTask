package com.example.educhattask.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.educhattask.models.AnnounceMent;
import com.exanple.educhattask.R;

import java.util.List;


public class AnnouncementAdapter extends
    RecyclerView.Adapter<AnnouncementAdapter.ViewHolder> {
    private List<AnnounceMent> mAnnounceMents;
    // Store the context for easy access
    private Context mContext;

    // Pass in the announce array into the constructor
    public AnnouncementAdapter(Context context, List<AnnounceMent> announceMents) {
        mAnnounceMents = announceMents;
        mContext = context;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View announceView = inflater.inflate(R.layout.list_announcement_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(announceView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Get the data model based on position
        AnnounceMent announceMent = mAnnounceMents.get(position);

        // Set item views based on your views and data model
        TextView textViewHeader = holder.headerTextView;
        textViewHeader.setText(announceMent.getAnsHeader());
        TextView textViewDeatil = holder.text1TextView;
        textViewDeatil.setText(announceMent.getAnsText());
        TextView textViewSub = holder.subText;
        textViewSub.setText(announceMent.getAnsTextSub());
        TextView textViewClass = holder.classText;
        textViewClass.setText(announceMent.getAnsTextClass());
        ImageView imageView = holder.annsImage;
        if(position%2==0) {
            imageView.setImageResource(R.drawable.ic_announcemnet);
        }else {
            imageView.setImageResource(R.drawable.ic_announcement_second);
        }
    }

    @Override
    public int getItemCount() {
        return mAnnounceMents.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView headerTextView;
        public TextView text1TextView;
        public TextView subText;
        public TextView classText;
        public ImageView annsImage;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            headerTextView = (TextView) itemView.findViewById(R.id.announcemnet_header);
            text1TextView = (TextView) itemView.findViewById(R.id.anounc_textView1);
            subText = (TextView) itemView.findViewById(R.id.anounc_textView2);
            classText = (TextView) itemView.findViewById(R.id.anounc_textView3);
            annsImage = (ImageView) itemView.findViewById(R.id.anouncement_img);
        }
    }
}