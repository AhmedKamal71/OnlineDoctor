package com.example.onlinedoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {
    Button login ;
    TextView forgot, or ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        login = findViewById(R.id.button_login);
        forgot = findViewById(R.id.text_forgot);
        or = findViewById(R.id.text_or);
        login.setOnClickListener(v -> {
            startActivity(new Intent(LoginScreen.this ,MenuScreen.class));
            finish();
        });
        forgot.setOnClickListener(v ->{
            startActivity(new Intent(LoginScreen.this ,MenuScreen.class));
            finish();
        });
        or.setOnClickListener(v ->{
            startActivity(new Intent(LoginScreen.this ,MenuScreen.class));
            finish();
        });
    }
}