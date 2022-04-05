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

import androidx.fragment.app.Fragment;

import com.example.orderfood.MainActivity;
import com.example.orderfood.R;

public class TabLogin extends Fragment {
    EditText login_phoneNumber, login_passWord;
    TextView login_forGot;
    Button btn_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.tab_login, container, false);


        login_phoneNumber = root.findViewById(R.id.login_phoneNumber);
        login_passWord = root.findViewById(R.id.login_passWord);
        login_forGot = root.findViewById(R.id.login_forGot);
        btn_login = root.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itent = new Intent(getActivity(), MainActivity.class);
                startActivity(itent);
            }
        });

        return root;
    }
}
