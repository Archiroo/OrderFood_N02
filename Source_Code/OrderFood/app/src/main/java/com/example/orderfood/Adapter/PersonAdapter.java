package com.example.orderfood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.orderfood.Model.Person;
import com.example.orderfood.R;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder1>{

    ArrayList<Person> mList_rcv;

    public PersonAdapter(ArrayList<Person> mList_rcv) {
        this.mList_rcv = mList_rcv;
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

        public PersonHolder1(@NonNull View itemView) {
            super(itemView);

            person_icon = itemView.findViewById(R.id.person_icon1);
            person_name = itemView.findViewById(R.id.person_name1);
        }
    }
}
