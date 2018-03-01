package com.example.admin.gv;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 10/23/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

Context context;
public MyAdapter(Context context)
{
    this.context=context;

}

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.my_layout,parent,false);

        MyHolder myHolder=new MyHolder(view);


        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
holder.imageView.setImageResource(context.getResources().getIdentifier("prof"+(position+1),"drawable",context.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class MyHolder extends RecyclerView.ViewHolder{
ImageView imageView;
        public MyHolder(View itemView) {
            super(itemView);
          imageView=(ImageView)itemView.findViewById(R.id.imageView);

        }

    }

}
