package com.example.orderfood.Adapter;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import java.util.ArrayList;

public class HomeRecyclerView3Adapter extends RecyclerView.Adapter<HomeRecyclerView3Adapter.HomeRecyclerView3Holder> {

    public ArrayList<HomeRecyclerview3> mList_rcv3;

    public HomeRecyclerView3Adapter(ArrayList<HomeRecyclerview3> mList_rcv3) {
        this.mList_rcv3 = mList_rcv3;
    }

    @NonNull
    @Override
    public HomeRecyclerView3Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_rcv3_item, parent, false);

        return new HomeRecyclerView3Adapter.HomeRecyclerView3Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerView3Holder holder, int position) {

        final HomeRecyclerview3 currentItem3 = mList_rcv3.get(position);
        if(currentItem3 == null){
            return;
        }

        // Khác null thực hiện
        holder.rcv3_image.setImageResource(currentItem3.getImage());
        holder.rcv3_name.setText(currentItem3.getImage_name());
        holder.rcv3_details.setText(currentItem3.getImage_details());

        holder.rcv3_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }



    @Override
    public int getItemCount() {
        if(mList_rcv3 != null){
            return mList_rcv3.size();
        }
        return 0;
    }

    public class HomeRecyclerView3Holder extends RecyclerView.ViewHolder{

        public ImageView rcv3_image;
        public TextView rcv3_name;
        public TextView rcv3_details;
        public ConstraintLayout rcv3_layout;

        public HomeRecyclerView3Holder(@NonNull View itemView) {
            super(itemView);
            rcv3_image = itemView.findViewById(R.id.home_rcv3_image);
            rcv3_name = itemView.findViewById(R.id.home_rcv3_name);
            rcv3_details = itemView.findViewById(R.id.home_rcv3_details);
            rcv3_layout = itemView.findViewById(R.id.home_rvc3_layoutItem);

        }
    }
}