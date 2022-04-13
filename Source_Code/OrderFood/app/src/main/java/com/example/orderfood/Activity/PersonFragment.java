package com.example.orderfood.Activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.orderfood.Adapter.PersonAdapter;
import com.example.orderfood.Model.Person;
import com.example.orderfood.R;

import java.util.ArrayList;


public class PersonFragment extends Fragment {
    Button btn_logout;
    private RecyclerView rcv1, rcv2;
    private PersonAdapter rcv1_Adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_person, container, false);

        //Recycleview 1
        ArrayList<Person> item_rcv1 = new ArrayList<>();
        item_rcv1.add(new Person(R.drawable.ic_userprofile,"Chỉnh sửa thông tin cá nhân"));
        item_rcv1.add(new Person(R.drawable.ic_key,"Thay đổi mật khẩu"));
        //Load
        rcv1 = view.findViewById(R.id.person_rcv1);
        rcv1_Adapter = new PersonAdapter(item_rcv1, getActivity());
        rcv1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rcv1.setAdapter(rcv1_Adapter);


        ArrayList<Person> item_rcv2 = new ArrayList<>();
        item_rcv2.add(new Person(R.drawable.ic_notification,"Chỉnh sửa thông báo"));
        item_rcv2.add(new Person(R.drawable.ic_history,"Lịch sử đặt hàng"));
        //Load
        rcv2 = view.findViewById(R.id.person_rcv2);
        rcv1_Adapter = new PersonAdapter(item_rcv2, getActivity());
        rcv2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rcv2.setAdapter(rcv1_Adapter);


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