package com.example.orderfood.Adapter;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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

import com.example.orderfood.Database.DBhelper;
import com.example.orderfood.Model.ObjectFood;
import com.example.orderfood.R;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryAdapterHolder>{

    public ArrayList<ObjectFood> history_item;

    public HistoryAdapter(ArrayList<ObjectFood> history_item) {
        this.history_item = history_item;
    }

    @NonNull
    @Override
    public HistoryAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_item, parent, false);

        return new HistoryAdapter.HistoryAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapterHolder holder, int position) {

        ObjectFood currentItem = history_item.get(position);
        if(currentItem == null){
            return;
        }
        holder.history_nameFood.setText(currentItem.getNameFood());
        Bitmap bitmap = BitmapFactory.decodeByteArray(currentItem.getImageFood(), 0, currentItem.getImageFood().length);
        holder.history_imageFood.setImageBitmap(bitmap);
        holder.history_quantity.setText(currentItem.getNameFood());
        holder.history_totalPrice.setText(currentItem.getNameFood());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HistoryAdapterHolder extends RecyclerView.ViewHolder{

        public ImageView history_imageFood;
        public TextView history_nameFood, history_quantity;
        public TextView history_totalPrice;
        public HistoryAdapterHolder(@NonNull View itemView) {
            super(itemView);
            history_imageFood = itemView.findViewById(R.id.history_imageFood);
            history_nameFood = itemView.findViewById(R.id.history_nameFood);
            history_quantity = itemView.findViewById(R.id.history_quantity);
            history_totalPrice = itemView.findViewById(R.id.history_totalPrice);
        }
    }
}
