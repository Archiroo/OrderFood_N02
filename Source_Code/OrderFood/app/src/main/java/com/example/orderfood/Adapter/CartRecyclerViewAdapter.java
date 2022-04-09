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

public class CartRecyclerViewAdapter extends RecyclerView.Adapter<CartRecyclerViewAdapter.CartRecyclerViewHolder>{

    public ArrayList<HomeRecyclerview3> cart_item;

    public CartRecyclerViewAdapter(ArrayList<HomeRecyclerview3> cart_item) {
        this.cart_item = cart_item;
    }

    @NonNull
    @Override
    public CartRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);

        return new CartRecyclerViewAdapter.CartRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartRecyclerViewHolder holder, int position) {

        HomeRecyclerview3 current_cartItem = cart_item.get(position);
        if(current_cartItem == null){
            return;
        }

        // Khác null thực hiện
        holder.cart_image.setImageResource(current_cartItem.getImageFood());
        holder.cart_name.setText(current_cartItem.getNameFood());
        holder.cart_price.setText(current_cartItem.getPriceFood());

    }

    @Override
    public int getItemCount() {
        if(cart_item != null){
            return cart_item.size();
        }
        return 0;
    }

    public class CartRecyclerViewHolder extends RecyclerView.ViewHolder{

        public ImageView cart_image;
        public TextView cart_name;
        public TextView cart_details;
        public TextView cart_price;
        public ConstraintLayout cart_layoutItem;

        public CartRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            cart_image = itemView.findViewById(R.id.cart_image);
            cart_name = itemView.findViewById(R.id.cart_nameFood);
            cart_price = itemView.findViewById(R.id.cart_price);
            cart_layoutItem = itemView.findViewById(R.id.cart_layoutItem);
        }
    }

}
