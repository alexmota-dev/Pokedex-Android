package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessfulRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_registration);
    }
    public void transitionFromSuccessfulRegistrationActivityToHomePageActivity(View view){
        Intent intent = new Intent(SuccessfulRegistrationActivity.this, HomePageActivity.class);
        startActivity(intent);
    }
}