package com.example.educhattask.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.educhattask.models.Group;
import com.exanple.educhattask.R;

import java.util.List;



public class GroupsAdapter extends
    RecyclerView.Adapter<GroupsAdapter.ViewHolder> {
    private List<Group> mGroups;
    // Store the context for easy access
    private Context mContext;

    // Pass in the group array into the constructor
    public GroupsAdapter(Context context, List<Group> groups) {
        mGroups = groups;
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
        View groupView = inflater.inflate(R.layout.list_group_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(groupView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Get the data model based on position
        Group group = mGroups.get(position);

        // Set item views based on your views and data model
        TextView textViewName = holder.groupTextView;
        textViewName.setText(group.getGroupName());

        ImageView groupImg = holder.groupImageView;
        groupImg.setImageResource(R.drawable.ic_group_chat_icon);
    }

    @Override
    public int getItemCount() {
        return mGroups.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView groupTextView;
        public ImageView groupImageView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            groupTextView = (TextView) itemView.findViewById(R.id.group_name);
            groupImageView = (ImageView) itemView.findViewById(R.id.group_img);
        }
    }
}