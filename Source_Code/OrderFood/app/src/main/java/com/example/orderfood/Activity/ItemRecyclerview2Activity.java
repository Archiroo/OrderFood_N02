package com.example.orderfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orderfood.Database.DBhelper;
import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.Model.ObjectFood;
import com.example.orderfood.R;

public class ItemRecyclerview2Activity extends AppCompatActivity {

    private ImageView imageFood;
    private ImageView imageMinus;
    private ImageView imagePlus;
    private TextView nameFood;
    private TextView priceFood;
    private TextView detailFood;
    private TextView numberFood;
    private ImageView btn_backHome;
    private Button btn_addCart;
    DBhelper db = new DBhelper(this);

    SQLiteDatabase db_orderFood = SQLiteDatabase.openOrCreateDatabase("/data/data/com.example.orderfood/databases/OrderFoodN02.sqlite", null);

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
        numberFood = findViewById(R.id.ic_rcv2_number);
        imageMinus = findViewById(R.id.ic_rcv2_minus);
        imagePlus = findViewById(R.id.ic_rcv2_plus);

        //Quay lai trang chu
        btn_backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoBack = new Intent(ItemRecyclerview2Activity.this , DashboardActivity.class);
                startActivity(intentGoBack);
            }
        });

        // Lấy dữ liệu từ item recyclerview2
        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }

        ObjectFood item_rcv2 = (ObjectFood) bundle.get("item_rcv2");
        Bitmap bitmap = BitmapFactory.decodeByteArray(item_rcv2.getImageFood(), 0, item_rcv2.getImageFood().length);
        imageFood.setImageBitmap(bitmap);
        nameFood.setText(item_rcv2.getNameFood());
        priceFood.setText(item_rcv2.getPriceFood());
        detailFood.setText(item_rcv2.getDetailFood());



        try{
            db.createCart();
        }
        catch(Exception e){

        }
        //Thêm giỏ hàng
        btn_addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int numberCart = Integer.parseInt(numberFood.getText()+"");
                    ContentValues values = new ContentValues();
                    values.put("CART_NAME", item_rcv2.getNameFood());
                    values.put("CART_PRICE", item_rcv2.getPriceFood());
                    values.put("CART_NUMBER", Integer.parseInt(numberFood.getText()+""));
                    values.put("CART_IMAGE", item_rcv2.getImageFood());
                    db_orderFood.insert("tb_cart", null, values);
                    Toast.makeText(ItemRecyclerview2Activity.this, "Thêm vào giỏ hàng thành công", Toast.LENGTH_SHORT).show();
                }
                catch (Exception exception){
                    exception.printStackTrace();
                    Toast.makeText(ItemRecyclerview2Activity.this, "Thêm món ăn thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });



        // Sự kiện thay đổi số lượng
        numberFood.setText("1");
        imageMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(numberFood.getText()+"");
                if(number1>0){
                    number1--;
                }
                numberFood.setText(String.valueOf(number1));
            }
        });

        imagePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(numberFood.getText()+"");
                number1++;
                numberFood.setText(String.valueOf(number1));
            }
        });
    }
}