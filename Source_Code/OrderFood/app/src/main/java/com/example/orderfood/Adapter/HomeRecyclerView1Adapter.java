package com.example.orderfood.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Interface.ChangeItemRCV3;
import com.example.orderfood.Model.HomeRecyclerview1;
import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import java.util.ArrayList;

public class HomeRecyclerView1Adapter extends RecyclerView.Adapter<HomeRecyclerView1Adapter.HomeRecyclerView1Holder>{

    private ArrayList<HomeRecyclerview1> mList_rcv1;
    int row_index = -1;

    //
    ChangeItemRCV3 changeItemRCV3;
    Activity activity;
    boolean check = true;
    boolean select = true;

    public HomeRecyclerView1Adapter(ArrayList<HomeRecyclerview1> mList_rcv1, Activity activity, ChangeItemRCV3 changeRecyclerview3) {
        this.mList_rcv1 = mList_rcv1;
        this.activity = activity;
        this.changeItemRCV3 = changeRecyclerview3;
    }

    @NonNull
    @Override
    public HomeRecyclerView1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Return view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_rcv1_item, parent, false);



        return new HomeRecyclerView1Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerView1Holder holder, @SuppressLint("RecyclerView") int position) {
        // Hiển thị dữ liệu lên List
        HomeRecyclerview1 currentItem1 = mList_rcv1.get(position);

        // Khác null thực hiện
        holder.rcv1_image.setImageResource(currentItem1.getImage());
        holder.rcv1_name.setText(currentItem1.getName_image());

        // Khi select 1 loại món ăn nào đó thì list món ăn tương ứng hiện ra
        if(check){
            ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
            // Sử dụng vòng lặp for và setter
            mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
            mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
            mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
            mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
            mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị

            changeItemRCV3.ChangItem(position, mList_rcv3);


            check = false;

        }
        holder.item_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if(position==0){
                    ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "115.000 VNĐ", "Rất ngon"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "115.000 VNĐ", "Rất ngon"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "115.000 VNĐ", "Rất ngon"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "115.000 VNĐ", "Rất ngon"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "115.000 VNĐ", "Rất ngon"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "115.000 VNĐ", "Rất ngon"));

                    changeItemRCV3.ChangItem(position, mList_rcv3);
                }

                else if(position==1){
                    holder.item_selected.setBackgroundResource(R.drawable.item_selected);

                    ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));

                    changeItemRCV3.ChangItem(position, mList_rcv3);
                }

                else if(position==2){

                    ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));

                    changeItemRCV3.ChangItem(position, mList_rcv3);
                }

                else if(position==3){
                    ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));

                    changeItemRCV3.ChangItem(position, mList_rcv3);
                }

                else if(position==4){
                    ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));

                    changeItemRCV3.ChangItem(position, mList_rcv3);
                }

                else if(position==5){
                    ArrayList<HomeRecyclerview3> mList_rcv3 = new ArrayList<HomeRecyclerview3>();
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
                    mList_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));

                    changeItemRCV3.ChangItem(position, mList_rcv3);
                }
            }
        });

        if(select){
            if (position==0)
                holder.item_selected.setBackgroundResource(R.drawable.item_selected);

            select = false;
        }
        else{
            if (row_index == position){
                holder.item_selected.setBackgroundResource(R.drawable.item_selected);
            }
            else {
                holder.item_selected.setBackgroundResource(R.drawable.home_rcv1_background);
            }
        }

    }

    @Override
    public int getItemCount() {
        if(mList_rcv1 != null){
            return mList_rcv1.size();
        }
        return 0;
    }



    public class HomeRecyclerView1Holder extends RecyclerView.ViewHolder{

        private ImageView rcv1_image;
        private TextView rcv1_name;
        LinearLayout item_selected;

        public HomeRecyclerView1Holder(@NonNull View itemView) {
            super(itemView);

            // Ánh xạ
            rcv1_image = itemView.findViewById(R.id.home_rcv1_item_image);
            rcv1_name = itemView.findViewById(R.id.home_rcv1_item_text);
            item_selected = itemView.findViewById(R.id.home_rvc1_layoutItem);

        }
    }
}
