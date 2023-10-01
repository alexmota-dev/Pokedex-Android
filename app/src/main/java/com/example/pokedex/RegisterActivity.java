package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void transitionRegisterToRegisterEmail(View view){
        Intent intent = new Intent(RegisterActivity.this, RegisterEmailActivity.class);
        startActivity(intent);
    }
    public void onBackPressedRegister(View view){
        super.onBackPressed();
    }
}