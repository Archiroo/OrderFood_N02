package com.example.orderfood.Processer;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.orderfood.Database.DBhelper;
import com.example.orderfood.MainActivity;
import com.example.orderfood.R;

public class TabLogin extends Fragment {
    EditText login_phoneNumber, login_passWord;
    TextView login_forGot;
    Button btn_login;
    DBhelper db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.tab_login, container, false);

        login_phoneNumber = root.findViewById(R.id.login_phoneNumber);
        login_passWord = root.findViewById(R.id.login_passWord);
        login_forGot = root.findViewById(R.id.login_forGot);
        btn_login = root.findViewById(R.id.btn_login);
        db = new DBhelper(getActivity());

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = login_phoneNumber.getText().toString();
                String userPhone = login_passWord.getText().toString();

                if(userName.equals(" ") || userPhone.equals(" ") ){
                    Toast.makeText(getActivity(), "Vui lòng kiểm tra lại thông tin tài khoản!",Toast.LENGTH_SHORT).show();
                }else{
                    boolean check = db.checkUserNamePassword(userName,userPhone);
                    if(check == true ){
                        Toast.makeText(getActivity(), "Đăng nhập thàn công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getActivity(), MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getActivity(), "Tài khoản không hợp lệ!", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });



        return root;
    }

}
