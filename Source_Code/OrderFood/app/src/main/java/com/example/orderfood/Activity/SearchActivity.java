package com.example.orderfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orderfood.R;

public class SearchActivity extends AppCompatActivity {
    private ImageView ic_backHome;
    private TextView nameFoodForSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ic_backHome = findViewById(R.id.ic_backHome);
        String nameFood = getIntent().getStringExtra("nameFood");
        nameFoodForSearch = findViewById(R.id.nameFoodForSearch);
        nameFoodForSearch.setText(nameFood);
        ic_backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });



    }
}