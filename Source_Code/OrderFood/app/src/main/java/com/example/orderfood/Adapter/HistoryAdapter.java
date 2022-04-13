package com.example.orderfood.Adapter;

import android.content.ContentValues;
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

import com.example.orderfood.Model.ObjectFood;
import com.example.orderfood.R;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryHolder> {

    private ArrayList<ObjectFood> history_item;

    public HistoryAdapter(ArrayList<ObjectFood> history_item) {
        this.history_item = history_item;
    }

    SQLiteDatabase sqLitedb = SQLiteDatabase.openOrCreateDatabase("/data/data/com.example.orderfood/databases/OrderFoodN02.sqlite", null);
    Cursor cursor = null;

    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_item, parent, false);

        return new HistoryAdapter.HistoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {

        ObjectFood currentItem = history_item.get(position);
        if(currentItem == null){
            return;
        }

        // Khác null thực hiện
        Bitmap bitmap = BitmapFactory.decodeByteArray(currentItem.getImageFood(), 0, currentItem.getImageFood().length);
        holder.history_image.setImageBitmap(bitmap);
        holder.history_nameFood.setText(currentItem.getNameFood());
        holder.history_price.setText(currentItem.getPriceFood());
        holder.history_quantity.setText(String.valueOf(currentItem.getNumber()));

    }

    @Override
    public int getItemCount() {
        if(history_item != null){
            return history_item.size();
        }
        return 0;
    }

    public class HistoryHolder extends RecyclerView.ViewHolder{

        public ImageView history_image;
        public TextView history_nameFood, history_quantity;
        public TextView history_price;

        public HistoryHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
