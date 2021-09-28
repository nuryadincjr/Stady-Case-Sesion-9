package com.nuryadincjr.stadycase09.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.nuryadincjr.stadycase09.MainActivity;
import com.nuryadincjr.stadycase09.R;
import com.nuryadincjr.stadycase09.databinding.ActivityLoginBinding;
import com.nuryadincjr.stadycase09.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view -> {
//            binding.btnLogin.setEnabled(false);
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}