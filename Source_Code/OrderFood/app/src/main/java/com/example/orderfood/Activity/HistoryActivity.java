package com.example.orderfood.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.orderfood.Adapter.CartAdapter;
import com.example.orderfood.R;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView rcv_cart;
    private CartAdapter rcv_cartAdapter;
    Button btn_elevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
}