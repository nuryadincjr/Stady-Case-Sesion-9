package com.nuryadincjr.stadycase09.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

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
            getLogin();
        });
    }

    private void getLogin() {
        String email = binding.etEmail.getText().toString();
        String paswd = binding.etPassword.getText().toString();
        String userEmail = "nuryadin.cjr@gmail.com";
        String userPaswd = "12345678";

        if(!email.equals("") || !paswd.equals("")){
            if (email.equals(userEmail) && paswd.equals(userPaswd)) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this,"Selamat datang\n"
                        +userEmail, Toast.LENGTH_SHORT).show();
            }else
                binding.etEmail.setError("Data tidak cocok!");
                binding.etPassword.setError("Data tidak cocok!");
        } else {
            binding.etEmail.setError("Data tidak boleh kosong!");
            binding.etPassword.setError("Data tidak boleh kosong!");
        }
    }
}