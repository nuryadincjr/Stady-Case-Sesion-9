package com.nuryadincjr.stadycase09.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.nuryadincjr.stadycase09.R;
import com.nuryadincjr.stadycase09.databinding.ActivityDetailsHirosBinding;
import com.nuryadincjr.stadycase09.pojo.Hiros;

import java.util.Locale;

public class DetailsHirosActivity extends AppCompatActivity {

    private ActivityDetailsHirosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_hiros);

        binding = ActivityDetailsHirosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Hiros hiros = getIntent().getParcelableExtra("HIROS");
        binding.ivImgDetail.setImageResource(hiros.getImg());
        binding.tvTitleDetail.setText(hiros.getTitle().toUpperCase(Locale.ROOT));
        binding.tvRetingDetail.setText(hiros.getReting());
        binding.tvDecriptionDetail.setText(hiros.getDescription());
        binding.tvPlatform.setText(hiros.getPlatform());
        binding.tvMetascore.setText(hiros.getMetascore());
        binding.tvGenre.setText(hiros.getGenre());
        binding.tvRealiseDate.setText(hiros.getRealise());
        binding.Develover1.setText(hiros.getDeveloper());
        binding.Develover2.setText("N/A");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}