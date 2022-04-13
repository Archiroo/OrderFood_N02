package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.orderfood.Model.Person;
import com.example.orderfood.R;

import java.util.ArrayList;


public class PersonFragment extends Fragment {
    Button btn_logout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_person, container, false);


//        btn_logout = (Button) view.findViewById(R.id.btn_logout);

//        btn_logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder dialog_confirmLogout = new AlertDialog.Builder(getActivity());
//                dialog_confirmLogout.setMessage("Bạn có muốn đăng xuất không ?");
//                dialog_confirmLogout.setPositiveButton("Có", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                        Toast.makeText(getActivity(),"Đăng xuất thành công",Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(getActivity(), LoginActivity.class);
//                        startActivity(intent);
//                    }
//                });
//                //không xoá
//                dialog_confirmLogout.setNegativeButton("Không", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//
//                dialog_confirmLogout.show();
//
//            }
//        });
        return view;
    }

}