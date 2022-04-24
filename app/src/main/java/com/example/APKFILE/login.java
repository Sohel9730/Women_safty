package com.example.APKFILE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void register(View view) {
        Toast.makeText(this, "Register ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    }
