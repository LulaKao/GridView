package com.example.slideimage_gridview_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHoler> {
    private Context context;
    private int images[];
    private String names[];

    public GridAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_image,null);
        ViewHoler viewHoler = new ViewHoler(v);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.ViewHoler holder, int position) {
        holder.img.setImageResource(images[position]);
        holder.txt.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        ImageButton gridImgButton;
        String txt_show;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.GridImgButton);
            txt = itemView.findViewById(R.id.GridTxt);
            gridImgButton = itemView.findViewById(R.id.GridImgButton);

            gridImgButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"成功點選："+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
