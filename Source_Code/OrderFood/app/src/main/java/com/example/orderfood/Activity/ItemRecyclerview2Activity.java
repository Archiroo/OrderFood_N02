package com.example.orderfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

public class ItemRecyclerview2Activity extends AppCompatActivity {

    private ImageView imageFood;
    private TextView nameFood;
    private TextView priceFood;
    private TextView detailFood;
    private ImageView btn_backHome;
    private Button btn_addCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_recyclerview2);

        // Ánh xạ
        imageFood = findViewById(R.id.item_rcv2_imageFood);
        nameFood = findViewById(R.id.item_rcv2_nameFood);
        priceFood = findViewById(R.id.item_rcv2_price);
        detailFood = findViewById(R.id.item_rcv2_nameDetail);
        btn_backHome = findViewById(R.id.ic_backHome);
        btn_addCart = findViewById(R.id.btn_rcv2_addCart);

        //Quay lai trang chu
        btn_backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoBack = new Intent(ItemRecyclerview2Activity.this , DashboardActivity.class);
                startActivity(intentGoBack);
            }
        });

        //Thêm giỏ hàng
        btn_addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ItemRecyclerview2Activity.this, "Thêm vào giỏ hàng thành công", Toast.LENGTH_SHORT).show();
            }
        });

        // Lấy dữ liệu từ item recyclerview2
        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }

        HomeRecyclerview3 item_rcv2 = (HomeRecyclerview3) bundle.get("item_rcv2");
        imageFood.setImageResource(item_rcv2.getImageFood());
        nameFood.setText(item_rcv2.getNameFood());
        priceFood.setText(item_rcv2.getPriceFood());
        detailFood.setText(item_rcv2.getDetailFood());
    }
}