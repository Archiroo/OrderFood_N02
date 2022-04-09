package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.orderfood.Adapter.CartRecyclerViewAdapter;
import com.example.orderfood.Adapter.HomeRecyclerView1Adapter;
import com.example.orderfood.Model.HomeRecyclerview3;
import com.example.orderfood.R;

import java.util.ArrayList;

public class CartFragment extends Fragment {

    private RecyclerView rcv_cart;
    private CartRecyclerViewAdapter rcv_cartAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_cart, container, false);


        ArrayList<HomeRecyclerview3> mList_cart = new ArrayList<HomeRecyclerview3>();
        // Sử dụng vòng lặp for và setter
        mList_cart.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_cart.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_cart.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị
        mList_cart.add(new HomeRecyclerview3(R.drawable.cat1, "Burger Bò Nướng", "115.000 VNĐ", "Rất ngon"));// thiết lập giá trị

        rcv_cart = view.findViewById(R.id.cart_rcv);
        rcv_cartAdapter = new CartRecyclerViewAdapter(mList_cart);
        rcv_cart.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rcv_cart.setAdapter(rcv_cartAdapter);

        return view;

    }
}