package com.example.orderfood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Activity.HomeFragment;
import com.example.orderfood.Model.HomeRecyclerview1;
import com.example.orderfood.R;

import java.util.ArrayList;

public class HomeRecyclerView1Adapter extends RecyclerView.Adapter<HomeRecyclerView1Adapter.HomeRecyclerView1Holder>{

    private ArrayList<HomeRecyclerview1> mList_rcv1;
    int row_index = -1;

    public HomeRecyclerView1Adapter(ArrayList<HomeRecyclerview1> mList_rcv1) {
        this.mList_rcv1 = mList_rcv1;
    }

    @NonNull
    @Override
    public HomeRecyclerView1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Return view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_rcv1_item, parent, false);



        return new HomeRecyclerView1Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerView1Holder holder, int position) {
        // Hiển thị dữ liệu lên List
        HomeRecyclerview1 currentItem1 = mList_rcv1.get(position);
        if(currentItem1 == null){
            return;
        }

        // Khác null thực hiện
        holder.rcv1_image.setImageResource(currentItem1.getImage());
        holder.rcv1_name.setText(currentItem1.getName_image());
        holder.item_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
            }
        });
        if (row_index == position){
            // Đổi màu item khi clisck
            holder.item_selected.setBackgroundResource(R.drawable.item_selected);
        }
        else
        {
            holder.item_selected.setBackgroundResource(R.drawable.home_rcv1_background);
        }

    }

    @Override
    public int getItemCount() {
        if(mList_rcv1 != null){
            return mList_rcv1.size();
        }
        return 0;
    }



    public class HomeRecyclerView1Holder extends RecyclerView.ViewHolder{

        private ImageView rcv1_image;
        private TextView rcv1_name;
        LinearLayout item_selected;

        public HomeRecyclerView1Holder(@NonNull View itemView) {
            super(itemView);

            // Ánh xạ
            rcv1_image = itemView.findViewById(R.id.home_rcv1_item_image);
            rcv1_name = itemView.findViewById(R.id.home_rcv1_item_text);
            item_selected = itemView.findViewById(R.id.home_rvc1_layoutItem);

        }
    }
}
