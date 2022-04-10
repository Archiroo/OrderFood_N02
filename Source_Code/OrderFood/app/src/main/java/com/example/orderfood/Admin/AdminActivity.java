package com.example.orderfood.Admin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.pm.ActivityInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderfood.Activity.LoginActivity;
import com.example.orderfood.R;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class AdminActivity extends AppCompatActivity {

    private ImageView btn_chooseImage;
    private TextView nameFood;
    private TextView detailFood;
    private TextView addFood;
    private TextView updateFood;
    private TextView priceFood;
    private RecyclerView admin_rcv;
    private TextView btn_logout;


    final int CHOOSE_IMAGE = 307;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        //Ánh xạ
        btn_chooseImage = findViewById(R.id.admin_imageFood);
        nameFood = findViewById(R.id.img_background);
        detailFood = findViewById(R.id.admin_detailFood);
        addFood = findViewById(R.id.btn_addFood);
        updateFood = findViewById(R.id.btn_updateFood);
        admin_rcv = findViewById(R.id.admin_rcv);
        priceFood = findViewById(R.id.admin_priceFood);
        btn_logout = findViewById(R.id.admin_logout);

        // Sự kiện chọn ảnh
        btn_chooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(
                        AdminActivity.this,
                        new String[]{
                                Manifest.permission.READ_EXTERNAL_STORAGE},
                        CHOOSE_IMAGE
                );
            }
        });

        //Chuyển sang login
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGotoLogin = new Intent(AdminActivity.this, LoginActivity.class);
                startActivity(intentGotoLogin);
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == CHOOSE_IMAGE){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent itentGoToLibary = new Intent(Intent.ACTION_PICK);
                itentGoToLibary.setType("image/*");
                startActivityForResult(itentGoToLibary, CHOOSE_IMAGE);
            }
            else{
                Toast.makeText(getApplicationContext(), "Bạn không thể truy cập thư viện ảnh", Toast.LENGTH_SHORT).show();
            }
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode == CHOOSE_IMAGE && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();

            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                btn_chooseImage.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}