package com.nuryadincjr.stadycase09.pojo;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nuryadincjr.stadycase09.databinding.ItemHiroBinding;

public class HiroViewHolder extends RecyclerView.ViewHolder {

    private ItemHiroBinding binding;

    public HiroViewHolder(@NonNull ItemHiroBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void setDataToView(int img, String title, String reting) {
        binding.ivHiro.setImageResource(img);
        binding.tvTitle.setText(title);
        binding.tvReting.setText(reting);
    }
}
