package com.example.orderfood.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderfood.Adapter.DetailRecyclerViewAdapter;
import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private ImageView btn_goBack;

    private RecyclerView rcv1_Detail;
    private DetailRecyclerViewAdapter rcv_detailAdapter;

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
                Intent intentGoBack = new Intent(DetailActivity.this, DashboardActivity.class);
                startActivity(intentGoBack);

            }
        });

        TextView btn_addCart1 = findViewById(R.id.btn_addCart1);
        btn_addCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailActivity.this, "Thêm vào giỏ hàng thành công", Toast.LENGTH_SHORT).show();

            }
        });




        //Recycle view
        ArrayList<HomeRecyclerview3> mList_detail = new ArrayList<HomeRecyclerview3>();
        // Sử dụng vòng lặp for và setter
        mList_detail.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_detail.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_detail.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_detail.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_detail.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_detail.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị

        rcv1_Detail = findViewById(R.id.detail_rcv1);
        rcv_detailAdapter = new DetailRecyclerViewAdapter(mList_detail);
        rcv1_Detail.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcv1_Detail.setAdapter(rcv_detailAdapter);


    }

}