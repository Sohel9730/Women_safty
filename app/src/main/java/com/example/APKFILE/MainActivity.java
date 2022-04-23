package com.example.APKFILE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // On click Listener function
    public void openActivity(View v){
        Toast.makeText(this, "Login ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }

    // ........ code is not working ...... make changes in the code for register activity ......


//    public void openActivity2(View v){
//        Toast.makeText(this, "Register ", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this,Register.class);
//        startActivity(intent);
//    }



}