package com.nuryadincjr.stadycase09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.nuryadincjr.stadycase09.databinding.ActivityMainBinding;
import com.nuryadincjr.stadycase09.pojo.HiroAdapter;
import com.nuryadincjr.stadycase09.pojo.Hiros;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String lorem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        ArrayList<Hiros> data = new ArrayList<>();
        data.add(new Hiros(R.drawable.img1,
                "Gatot Kaca", "4.0",
                lorem));
        data.add(new Hiros(R.drawable.img2,
                "Nuryadin", "5.0",
                lorem));
        data.add(new Hiros(R.drawable.img3,
                "Spaider-man", "4.0",
                lorem));
        data.add(new Hiros(R.drawable.img4,
                "Gatot Kaca", "4.0",
                lorem));

        HiroAdapter adapter = new HiroAdapter(data, this);
        binding.rvHero.setLayoutManager(new GridLayoutManager(this, 2));

        binding.rvHero.setAdapter(adapter);
    }
}