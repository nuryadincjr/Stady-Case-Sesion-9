package com.nuryadincjr.stadycase09;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;

import com.nuryadincjr.stadycase09.databinding.ActivityMainBinding;
import com.nuryadincjr.stadycase09.pojo.HiroAdapter;
import com.nuryadincjr.stadycase09.pojo.Hiros;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Hiros> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getHios();

        HiroAdapter adapter = new HiroAdapter(data, this);
        binding.rvHero.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rvHero.setAdapter(adapter);
    }


    private void getHios() {
        if(data == null) {
            String[] title, description, reting, platform, metascore, genre, realise, developer;

            final TypedArray img = getResources().obtainTypedArray(R.array.hiro_image);

            title = getData(R.array.hiro_title);
            reting = getData(R.array.hiro_reting);
            description = getData(R.array.hiro_detail);
            platform = getData(R.array.hiro_platform);
            metascore = getData(R.array.hiro_metascore);
            genre = getData(R.array.hiro_genre);
            realise = getData(R.array.hiro_realise_date);
            developer = getData(R.array.hiro_develover);

            data = new ArrayList<Hiros>();
            for (int i=0; i < title.length; i++) {
                data.add(new Hiros(img.getResourceId(i, -1),
                        title[i], reting[i], description[i], platform[i],
                        metascore[i], genre[i], realise[i], developer[i]));
            }
        }
    }

    private String[] getData(int in) {
        return getResources().getStringArray(in);
    }
}