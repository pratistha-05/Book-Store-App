package com.example.mystore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    Context context;
    ArrayList<User> userList;

    public Adapter(Context context, ArrayList<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
User user=userList.get(position);
holder.bookName.setText(user.bookName);
        holder.bookName.setText(user.bookName);
        holder.author.setText(user.author);
        holder.genre.setText(user.genre);
        holder.price.setText(String.valueOf(user.price));


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView bookName,genre,author,price;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bookName=itemView.findViewById(R.id.book);
            genre=itemView.findViewById(R.id.genre);
            author=itemView.findViewById(R.id.author);
            price=itemView.findViewById(R.id.price);
        }
    }
}
