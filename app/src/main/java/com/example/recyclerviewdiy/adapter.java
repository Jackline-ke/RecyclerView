package com.example.recyclerviewdiy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
    //create an arrayList
    private ArrayList<items> list;

    //create a constructor
    public adapter(ArrayList<items> list){
        this.list = list;
    }

    @NonNull
    @Override
    //this method creates and initialize a new viewHolder
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return  new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false));
    }

    @Override
    //recyclerView call this method to associate the viewHolder with the appropriate data
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.image.setImageResource(list.get(position).getImageView());
      holder.text.setText(list.get(position).getTextView());
    }

    @Override
    //recyclerView call this method th know the size of the data set
    public int getItemCount() {
        return list.size();
    }

    //create a ViewHolder class
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView text;

        //create a constructor that will find view by id
        public ViewHolder(final View view){
            super(view);

            image = view.findViewById(R.id.imageView);
            text = view.findViewById(R.id.textView);
        }
    }
}
