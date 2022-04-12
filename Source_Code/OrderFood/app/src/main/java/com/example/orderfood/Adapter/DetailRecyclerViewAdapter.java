package com.example.orderfood.Adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.Model.ObjectFood;
import com.example.orderfood.R;

import java.util.ArrayList;

public class DetailRecyclerViewAdapter extends RecyclerView.Adapter<DetailRecyclerViewAdapter.DetailRecyclerViewHolder>{

    public ArrayList<ObjectFood> mList_detailItem;

    public DetailRecyclerViewAdapter(ArrayList<ObjectFood> mList_detailItem) {
        this.mList_detailItem = mList_detailItem;
    }

    @NonNull
    @Override
    public DetailRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_rcv1_item, parent, false);

        return new DetailRecyclerViewAdapter.DetailRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailRecyclerViewHolder holder, int position) {

        ObjectFood currentItem_detail = mList_detailItem.get(position);
        if(currentItem_detail == null){
            return;
        }

        // Khác null thực hiện
        Bitmap bitmap = BitmapFactory.decodeByteArray(currentItem_detail.getImageFood(), 0, currentItem_detail.getImageFood().length);
        holder.detail_image.setImageBitmap(bitmap);
        holder.detail_name.setText(currentItem_detail.getNameFood());
        holder.detail_detail.setText(currentItem_detail.getNameFood());
        holder.detail_price.setText(currentItem_detail.getDetailFood());

    }

    @Override
    public int getItemCount() {
        if(mList_detailItem != null){
            return mList_detailItem.size();
        }
        return 0;
    }

    public class DetailRecyclerViewHolder extends RecyclerView.ViewHolder{

        public ImageView detail_image;
        public TextView detail_name;
        public TextView detail_price;
        public TextView detail_detail;
        public TextView detail_btnAdd;
        public ConstraintLayout cart_layoutItem;

        public DetailRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            detail_image = itemView.findViewById(R.id.detail_itemImage);
            detail_name = itemView.findViewById(R.id.detail_itemNameFood);
            detail_price = itemView.findViewById(R.id.detail_money);
            detail_detail = itemView.findViewById(R.id.detail_itemDetail);
            detail_btnAdd = itemView.findViewById(R.id.btn_addCart);
            cart_layoutItem = itemView.findViewById(R.id.detail_layout_rcv);


        }
    }
}
