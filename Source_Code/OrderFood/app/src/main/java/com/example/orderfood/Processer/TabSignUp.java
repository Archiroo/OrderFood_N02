package com.example.orderfood.Processer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.orderfood.R;

public class TabSignUp extends Fragment {
    EditText signup_phoneNumber, signup_passWord, signup_confirmPass;
    Button btn_signin;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.tab_signup, container, false);

        signup_phoneNumber = root.findViewById(R.id.signUp_phoneNumber);
        signup_passWord = root.findViewById(R.id.signUp_passWord);
        signup_confirmPass = root.findViewById(R.id.signUp_conFirmPassWord);
        btn_signin = root.findViewById(R.id.btn_signUp);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);


               Toast.makeText(getActivity(), "Đăng ký thành công", Toast.LENGTH_LONG).show();

            }
        });

        return root;
    }


}
