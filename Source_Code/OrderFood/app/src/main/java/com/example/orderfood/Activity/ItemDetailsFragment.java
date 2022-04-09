package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;


public class ItemDetailsFragment extends Fragment {

    private TextView detail_imageName;
    private TextView detail_imageDetail;
    private ImageView detail_image;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_item_details, container, false);

        //Anh Xa
        detail_imageName = view.findViewById(R.id.detail_imageName);
        detail_imageDetail = view.findViewById(R.id.detail_imageDetail);
        detail_image = view.findViewById(R.id.detail_image);



        return view;
    }
}