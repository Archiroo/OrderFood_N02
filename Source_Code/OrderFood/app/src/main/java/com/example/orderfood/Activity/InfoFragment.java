package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfood.Adapter.DeliveryAdapter;
import com.example.orderfood.Adapter.HomeRecyclerView1Adapter;
import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import java.util.ArrayList;

public class InfoFragment extends Fragment {

    private RecyclerView rcv1_item;
    private DeliveryAdapter delivery_Adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_info, container, false);

        ArrayList<HomeRecyclerview3> item_rcv3 = new ArrayList<>();
        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng 1", "70.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat2, "Burger Bò Nướng 2", "80.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));
        item_rcv3.add(new HomeRecyclerview3(R.drawable.cat3, "Burger Bò Nướng 3", "90.000 VNĐ", "Thịt Bò được nhập khẩu từ Mỹ"));



        rcv1_item = view.findViewById(R.id.delivery_rcv);
        delivery_Adapter = new DeliveryAdapter(item_rcv3);
        rcv1_item.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rcv1_item.setAdapter(delivery_Adapter);



        return view;
    }
}