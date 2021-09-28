package com.nuryadincjr.stadycase09.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.nuryadincjr.stadycase09.R;
import com.nuryadincjr.stadycase09.databinding.ActivityDetailsHirosBinding;

public class DetailsHirosActivity extends AppCompatActivity {

    private ActivityDetailsHirosBinding binding;
//    https://chat.whatsapp.com/HBJLQJYDJcU1xGUt86lTDT
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_hiros);
        binding = ActivityDetailsHirosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        int img = intent.getIntExtra("img", 0);
        String title = intent.getStringExtra("title");
        String reting = intent.getStringExtra("reting");
        String detail = intent.getStringExtra("detail");

        binding.ivImgDetail.setImageResource(img);
        binding.tvTitleDetail.setText(title);
        binding.tvRetingDetail.setText(reting);
        binding.tvDecriptionDetail.setText(detail);
    }
}