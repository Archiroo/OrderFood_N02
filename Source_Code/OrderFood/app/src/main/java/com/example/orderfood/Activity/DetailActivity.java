package com.example.orderfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

public class DetailActivity extends AppCompatActivity {

    private ImageView btn_goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }

        HomeRecyclerview3 item_rcv3 = (HomeRecyclerview3) bundle.get("objectFood");
        TextView nameFood = findViewById(R.id.detail_imageName);
        nameFood.setText(item_rcv3.getNameFood());

        ImageView imageFood = findViewById(R.id.detail_image);
        imageFood.setImageResource(item_rcv3.getImageFood());

        TextView detailFood = findViewById(R.id.detail_imageDetail);
        detailFood.setText(item_rcv3.getDetailFood());

        btn_goBack = findViewById(R.id.ic_back);
        btn_goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoBack = new Intent(DetailActivity.this, HomeFragment.class);
                startActivity(intentGoBack);

            }
        });




    }
}