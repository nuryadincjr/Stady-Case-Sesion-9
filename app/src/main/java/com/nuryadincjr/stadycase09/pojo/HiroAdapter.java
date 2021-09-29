package com.nuryadincjr.stadycase09.pojo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nuryadincjr.stadycase09.activity.DetailsHirosActivity;
import com.nuryadincjr.stadycase09.databinding.ItemHiroBinding;

import java.util.ArrayList;

public class HiroAdapter extends RecyclerView.Adapter<HiroViewHolder> {

    private final ArrayList<Hiros> data;
    private final Context context;

    public HiroAdapter(ArrayList<Hiros> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public HiroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHiroBinding binding = ItemHiroBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);

        return new HiroViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HiroViewHolder holder, int position) {
        String title, description, reting, platform, metascore, genre, realise, developer;

        int img = data.get(position).getImg();
        title = data.get(position).getTitle();
        description = data.get(position).getDescription();
        reting = data.get(position).getReting();
        platform = data.get(position).getPlatform();
        metascore = data.get(position).getMetascore();
        genre = data.get(position).getGenre();
        realise = data.get(position).getRealise();
        developer = data.get(position).getDeveloper();

        holder.setDataToView(img, title, reting);

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailsHirosActivity.class);
            intent.putExtra("HIROS", new Hiros(img,
                    title, reting, description, platform,
                    metascore, genre, realise, developer));
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
