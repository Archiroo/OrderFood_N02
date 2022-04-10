package com.example.orderfood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdminRecyclerViewAdapter extends RecyclerView.Adapter<AdminRecyclerViewAdapter.AdminRecyclerViewHolder>{

    ArrayList<HomeRecyclerview3> mList_rcv;

    public AdminRecyclerViewAdapter(ArrayList<HomeRecyclerview3> mList_rcv) {
        this.mList_rcv = mList_rcv;
    }

    @NonNull
    @Override
    public AdminRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.admin_rcv_item, parent, false);

        return new AdminRecyclerViewAdapter.AdminRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminRecyclerViewHolder holder, int position) {

        HomeRecyclerview3 currentItem = mList_rcv.get(position);
        if(currentItem == null){
            return;
        }

        // Khác null thực hiện
        holder.imageFood.setImageResource(currentItem.getImageFood());
        holder.nameFood.setText(currentItem.getNameFood());
        holder.detailFood.setText(currentItem.getDetailFood());
        holder.priceFood.setText(currentItem.getPriceFood());


    }

    @Override
    public int getItemCount() {
        if(mList_rcv != null){
            return mList_rcv.size();
        }
        return 0;
    }

    public class AdminRecyclerViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageFood;
        private TextView nameFood;
        private TextView detailFood;
        private TextView priceFood;

        public AdminRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            imageFood = itemView.findViewById(R.id.admin_imageFood);
            nameFood = itemView.findViewById(R.id.admin_item_nameFood);
            detailFood = itemView.findViewById(R.id.admin_item_detail);
            priceFood = itemView.findViewById(R.id.admin_item_priceFood);
        }
    }

}
