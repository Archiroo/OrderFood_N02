package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfood.Adapter.ImageAdapter;
import com.example.orderfood.Model.ImageSlider;
import com.example.orderfood.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment {

    // Code xử lý silder image
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private ImageAdapter imageAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.home_imageSilder);
        circleIndicator = view.findViewById(R.id.home_circleIndicator);
        imageAdapter = new ImageAdapter(getActivity(), getListImage());
        viewPager.setAdapter(imageAdapter);

        circleIndicator.setViewPager(viewPager);

        imageAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

        return view;
    }

    private List<ImageSlider> getListImage() {
        List<ImageSlider> list = new ArrayList<>();

        list.add(new ImageSlider(R.drawable.banner1));
        list.add(new ImageSlider(R.drawable.banner2));
        list.add(new ImageSlider(R.drawable.banner3));
        list.add(new ImageSlider(R.drawable.banner4));

        return list;
    }
}