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
import com.example.orderfood.Model.HomeRecyclerview1;
import com.example.orderfood.Model.ImageSlider;
import com.example.orderfood.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {

    // Code xử lý silder image
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private HomeBanner homeBanner;

    //Đổ dữ liệu lên recyclerview
    private RecyclerView rcv1_Data;
    private HomeRecyclerView1Adapter rcv1_Adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);


        //Ánh xạ
        viewPager = view.findViewById(R.id.home_imageSilder);
        circleIndicator = view.findViewById(R.id.home_circleIndicator);
        rcv1_Data = view.findViewById(R.id.home_rcv1);




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

        rcv1_Data = view.findViewById(R.id.home_rcv1);
        rcv1_Adapter = new HomeRecyclerView1Adapter(item_rcv1);
        rcv1_Data.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rcv1_Data.setAdapter(rcv1_Adapter);





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

    //Đổ dữ liệu Recycleview1
    private ArrayList<HomeRecyclerview1> getListRCV1() {
        List<HomeRecyclerview1> list1 = new ArrayList<>();
        list1.add(new HomeRecyclerview1(R.drawable.cat1, "Burger"));
        list1.add(new HomeRecyclerview1(R.drawable.cat2, "Pizza"));
        list1.add(new HomeRecyclerview1(R.drawable.cat3, "Bread"));
        list1.add(new HomeRecyclerview1(R.drawable.cat4, "Fried Chicken"));
        list1.add(new HomeRecyclerview1(R.drawable.cat5, "Cocacola"));
        list1.add(new HomeRecyclerview1(R.drawable.cat6, "Fanta"));

        return (ArrayList<HomeRecyclerview1>) list1;
    }
}