package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfood.Adapter.HomeBanner;
import com.example.orderfood.Adapter.HomeRecyclerView1Adapter;
import com.example.orderfood.Adapter.HomeRecyclerView2Adapter;
import com.example.orderfood.Adapter.HomeRecyclerView3Adapter;
import com.example.orderfood.Interface.ChangeItemRCV3;
import com.example.orderfood.Model.HomeRecyclerview1;
import com.example.orderfood.Model.HomeRecyclerview2;
import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.Model.ImageSlider;
import com.example.orderfood.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment implements ChangeItemRCV3 {

    // Code xử lý silder image
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private HomeBanner homeBanner;

    //Đổ dữ liệu lên recyclerview
    private RecyclerView rcv1_Data, rcv2_Data, rcv3_Data;
    private HomeRecyclerView1Adapter rcv1_Adapter;
    private HomeRecyclerView2Adapter rcv2_Adapter;
    private HomeRecyclerView3Adapter rcv3_Adapter;

    ArrayList<HomeRecyclerview3> item_rcv3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        //Ánh xạ
        viewPager = view.findViewById(R.id.home_imageSilder);
        circleIndicator = view.findViewById(R.id.home_circleIndicator);
        rcv1_Data = view.findViewById(R.id.home_rcv1);
        rcv2_Data = view.findViewById(R.id.home_rcv2);
        rcv3_Data = view.findViewById(R.id.home_rcv3);



        //Banner
        homeBanner = new HomeBanner(getActivity(), getListImage());
        viewPager.setAdapter(homeBanner);
        circleIndicator.setViewPager(viewPager);



        //Recycleview 1
        ArrayList<HomeRecyclerview1> item_rcv1 = new ArrayList<>();
        item_rcv1.add(new HomeRecyclerview1(R.drawable.cat1,"Burger"));
        item_rcv1.add(new HomeRecyclerview1(R.drawable.cat2,"Pizza"));
        item_rcv1.add(new HomeRecyclerview1(R.drawable.cat3,"Bread"));
        item_rcv1.add(new HomeRecyclerview1(R.drawable.cat4,"Chicken"));
        item_rcv1.add(new HomeRecyclerview1(R.drawable.cat5,"Cocacola"));
        item_rcv1.add(new HomeRecyclerview1(R.drawable.cat6,"Fanta"));

        //Load
        rcv1_Data = view.findViewById(R.id.home_rcv1);
        rcv1_Adapter = new HomeRecyclerView1Adapter(item_rcv1, getActivity(), this);
        rcv1_Data.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rcv1_Data.setAdapter(rcv1_Adapter);


        //Recycleview 2
        ArrayList<HomeRecyclerview2> item_rcv2 = new ArrayList<>();
        item_rcv2.add(new HomeRecyclerview2(R.drawable.cat1,"Burger Bò", "115.000 VNĐ"));
        item_rcv2.add(new HomeRecyclerview2(R.drawable.cat2,"Pizza Cháy", "115.000 VNĐ"));
        item_rcv2.add(new HomeRecyclerview2(R.drawable.cat3,"Bread Pate", "115.000 VNĐ"));
        item_rcv2.add(new HomeRecyclerview2(R.drawable.cat4,"Chicken Fired", "115.000 VNĐ"));
        item_rcv2.add(new HomeRecyclerview2(R.drawable.cat5,"Cocacola", "115.000 VNĐ"));
        item_rcv2.add(new HomeRecyclerview2(R.drawable.cat6,"Fanta", "115.000 VNĐ"));

        //Load
        rcv2_Data = view.findViewById(R.id.home_rcv2);
        rcv2_Adapter = new HomeRecyclerView2Adapter(item_rcv2);
        rcv2_Data.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rcv2_Data.setAdapter(rcv2_Adapter);



        //Recycleview 3
        item_rcv3 = new ArrayList<>();
//        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "Thịt bò được nhập khẩu từ Mỹ"));
//        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 1", "Thịt bò được nhập khẩu từ Mỹ"));
//        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 1", "Thịt bò được nhập khẩu từ Mỹ"));
//        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat4, "Burger Bò Nướng 1", "Thịt bò được nhập khẩu từ Mỹ"));
//        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat5, "Burger Bò Nướng 1", "Thịt bò được nhập khẩu từ Mỹ"));
//        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat6, "Burger Bò Nướng 1", "Thịt bò được nhập khẩu từ Mỹ"));
        //Load
        rcv3_Data = view.findViewById(R.id.home_rcv3);
        rcv3_Adapter = new HomeRecyclerView3Adapter(item_rcv3);
        rcv3_Data.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rcv3_Data.setAdapter(rcv3_Adapter);


        return view;
    }

    //Đổ dữ liệu banner
    private List<ImageSlider> getListImage() {
        List<ImageSlider> list = new ArrayList<>();
        list.add(new ImageSlider(R.drawable.banner1));
        list.add(new ImageSlider(R.drawable.banner2));
        list.add(new ImageSlider(R.drawable.banner3));
        list.add(new ImageSlider(R.drawable.banner4));
        return list;
    }

    @Override
    public void ChangItem(int index, ArrayList<HomeRecyclerview3> item) {
        rcv3_Adapter = new HomeRecyclerView3Adapter(item);
        rcv3_Adapter.notifyDataSetChanged();
        rcv3_Data.setAdapter(rcv3_Adapter);
    }
}