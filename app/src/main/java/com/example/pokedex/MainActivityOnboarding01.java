package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityOnboarding01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding01);
    }
    public void transitionFromOnboarding01tToOnboarding02(View view){
        Intent intent = new Intent(MainActivityOnboarding01.this, Onboarding02Activity.class);
        startActivity(intent);
    }
}