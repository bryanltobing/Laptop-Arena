package com.bryan1.laptoparena.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bryan1.laptoparena.R;
import com.bryan1.laptoparena.model.Laptop;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLaptopAdapter extends RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>
{
    private OnItemClickCallBack onItemClickCallBack;
    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack)
    {
        this.onItemClickCallBack = onItemClickCallBack;
    }
    private ArrayList<Laptop> listLaptop;

    public ListLaptopAdapter(ArrayList<Laptop> list) {
        this.listLaptop = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_laptop, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Laptop laptop = listLaptop.get(position);
        Glide.with(holder.itemView.getContext())
                .load(laptop.getPhoto())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.imgPhoto);
        holder.tvName.setText(laptop.getName());
        holder.tvDetail.setText(laptop.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                onItemClickCallBack .onItemClicked(listLaptop.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallBack
    {
        void onItemClicked(Laptop data);
    }
}
