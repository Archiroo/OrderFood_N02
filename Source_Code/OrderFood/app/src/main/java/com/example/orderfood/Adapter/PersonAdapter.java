package com.example.orderfood.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Activity.HistoryActivity;
import com.example.orderfood.Model.Person;
import com.example.orderfood.R;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder1>{

    ArrayList<Person> mList_rcv;
    private Context mContext;

    public PersonAdapter(ArrayList<Person> mList_rcv, Context mContext) {
        this.mList_rcv = mList_rcv;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public PersonHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item, parent, false);

        return new PersonAdapter.PersonHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder1 holder, int position) {

        Person currentItem = mList_rcv.get(position);
        if (currentItem == null) {
            return;
        }
        // Khác null thực hiện
        holder.person_icon.setImageResource(currentItem.getImage());
        holder.person_name.setText(currentItem.getName_image());
        // Chuyen sang history
        holder.person_itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToHistoryActivity();
            }
        });
    }

    private void goToHistoryActivity() {
        Intent intent = new Intent(mContext, HistoryActivity.class);
        mContext.startActivity(intent);
    }

    private  void ClearContext(){
        mContext = null;
    }

    @Override
    public int getItemCount() {
        if(mList_rcv != null){
            return mList_rcv.size();
        }
        return 0;
    }

    public class PersonHolder1 extends RecyclerView.ViewHolder{

        private ImageView person_icon;
        private TextView person_name;
        private ConstraintLayout person_itemLayout;

        public PersonHolder1(@NonNull View itemView) {
            super(itemView);

            person_icon = itemView.findViewById(R.id.person_icon1);
            person_name = itemView.findViewById(R.id.person_name1);
            person_itemLayout = itemView.findViewById(R.id.person_itemLayout);
        }
    }
}
