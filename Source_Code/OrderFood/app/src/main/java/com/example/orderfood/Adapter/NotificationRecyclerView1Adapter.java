package com.example.orderfood.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.Notification_Recyclerview1;
import com.example.orderfood.R;

import java.util.ArrayList;

public class NotificationRecyclerView1Adapter extends RecyclerView.Adapter<NotificationRecyclerView1Adapter.NotificationRecyclerViewHolder> {

    private ArrayList<Notification_Recyclerview1> mListNotification;

    public NotificationRecyclerView1Adapter(ArrayList<Notification_Recyclerview1> mListNotification) {
        this.mListNotification = mListNotification;
    }

    @NonNull
    @Override
    public NotificationRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_rcv1,parent, false);

        return new NotificationRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationRecyclerViewHolder holder, int position) {
        Notification_Recyclerview1 notification_rcv1 = mListNotification.get(position);
        if (notification_rcv1 == null){
            return;
        }

        holder.imageStore.setImageResource(notification_rcv1.getImage());
        holder.nameStore.setText(notification_rcv1.getNameStore());
        holder.content.setText(notification_rcv1.getContent());

    }

    @Override
    public int getItemCount() {
        if(mListNotification != null){
            return mListNotification.size();
        }
        return 0;
    }

    public class NotificationRecyclerViewHolder extends RecyclerView.ViewHolder{

        private TextView nameStore;
        private TextView content;
        private ImageView imageStore;

        public NotificationRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            nameStore = itemView.findViewById(R.id.notification_nameStore);
            content = itemView.findViewById(R.id.notification_content);
            imageStore = itemView.findViewById(R.id.notification_imageStore);


        }
    }

}
