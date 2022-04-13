package com.example.orderfood.Adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.ObjectFood;
import com.example.orderfood.R;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchHolder>{

    public ArrayList<ObjectFood> mList_Search;

    public SearchAdapter(ArrayList<ObjectFood> mList_Search) {
        this.mList_Search = mList_Search;
    }

    @NonNull
    @Override
    public SearchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_rcv1_item, parent, false);

        return new SearchAdapter.SearchHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchHolder holder, int position) {

        ObjectFood currentItem = mList_Search.get(position);
        if(currentItem == null){
            return;
        }
        Bitmap bitmap = BitmapFactory.decodeByteArray(currentItem.getImageFood(), 0, currentItem.getImageFood().length);
        holder.imageFood.setImageBitmap(bitmap);
        holder.nameFood.setText(currentItem.getNameFood());
        holder.priceFood.setText(currentItem.getNameFood());
        holder.addCart.setText(currentItem.getDetailFood());


    }

    @Override
    public int getItemCount() {
        if(mList_Search != null){
            return mList_Search.size();
        }
        return 0;
    }

    public class SearchHolder extends RecyclerView.ViewHolder{
        private ImageView imageFood;

        private TextView nameFood;

        private TextView priceFood;

        private TextView addCart;

        public SearchHolder(@NonNull View itemView) {
            super(itemView);

            imageFood = itemView.findViewById(R.id.detail_itemImage);
            nameFood = itemView.findViewById(R.id.detail_itemNameFood);
            priceFood = itemView.findViewById(R.id.detail_money);
            addCart = itemView.findViewById(R.id.btn_addCart);
        }
    }
}
