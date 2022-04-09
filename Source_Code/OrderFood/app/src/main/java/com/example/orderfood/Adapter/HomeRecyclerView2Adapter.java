package com.example.orderfood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.HomeRecyclerview2;
import com.example.orderfood.R;

import java.util.ArrayList;

public class HomeRecyclerView2Adapter extends RecyclerView.Adapter<HomeRecyclerView2Adapter.HomeRecyclerView2Holder> {

    private ArrayList<HomeRecyclerview2> mList_rcv2;

    public HomeRecyclerView2Adapter(ArrayList<HomeRecyclerview2> mList_rcv2) {
        this.mList_rcv2 = mList_rcv2;
    }

    @NonNull
    @Override
    public HomeRecyclerView2Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_rcv2_item, parent, false);



        return new HomeRecyclerView2Adapter.HomeRecyclerView2Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerView2Holder holder, int position) {

        // Hiển thị dữ liệu lên List
        HomeRecyclerview2 currentItem2 = mList_rcv2.get(position);
        if(currentItem2 == null){
            return;
        }

        // Khác null thực hiện
        holder.rcv2_image.setImageResource(currentItem2.getImage());
        holder.rcv2_name.setText(currentItem2.getImage_name());
        holder.rcv2_price.setText(currentItem2.getImage_price());

    }

    @Override
    public int getItemCount() {
        if(mList_rcv2 != null){
            return mList_rcv2.size();
        }
        return 0;
    }

    public class HomeRecyclerView2Holder extends RecyclerView.ViewHolder{

        private ImageView rcv2_image;
        private TextView rcv2_name;
        private TextView rcv2_price;
        private ConstraintLayout item_select;

        public HomeRecyclerView2Holder(@NonNull View itemView) {
            super(itemView);

            // Ánh xạ
            rcv2_image = itemView.findViewById(R.id.home_rcv2_image);
            rcv2_name = itemView.findViewById(R.id.home_rcv2_name);
            rcv2_price = itemView.findViewById(R.id.home_rcv2_price);
            item_select = itemView.findViewById(R.id.home_rvc2_layoutItem);
        }
    }



}
