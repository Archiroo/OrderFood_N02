package com.example.orderfood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import java.util.ArrayList;

public class DeliveryAdapter extends RecyclerView.Adapter<DeliveryAdapter.DeliveryHolder>{

    private ArrayList<HomeRecyclerview3> mList_item;

    public DeliveryAdapter(ArrayList<HomeRecyclerview3> mList_item) {
        this.mList_item = mList_item;
    }

    @NonNull
    @Override
    public DeliveryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.delivery_item, parent, false);

        return new DeliveryAdapter.DeliveryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryHolder holder, int position) {

        HomeRecyclerview3 currentItem = mList_item.get(position);
        if(currentItem == null){
            return;
        }

        // Khác null thực hiện
        holder.delivery_image.setImageResource(currentItem.getImageFood());
        holder.delivery_name.setText(currentItem.getNameFood());
        holder.delivery_totalPrice.setText(currentItem.getPriceFood());

    }

    @Override
    public int getItemCount() {
        if(mList_item != null){
            return mList_item.size();
        }
        return 0;
    }

    public class DeliveryHolder extends RecyclerView.ViewHolder{

        public ImageView delivery_image;
        public TextView delivery_name;
        public TextView delivery_totalPrice;
        public TextView delivery_quantity;

        public DeliveryHolder(@NonNull View itemView) {
            super(itemView);

            delivery_image = itemView.findViewById(R.id.delivery_imageFood);
            delivery_name = itemView.findViewById(R.id.delivery_nameFood);
            delivery_totalPrice = itemView.findViewById(R.id.delivery_totalPrice);
            delivery_quantity = itemView.findViewById(R.id.delivery_quantity);
        }
    }
}
