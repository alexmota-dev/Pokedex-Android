package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding02);
    }
    public void transitionFromOnboarding02tToLoginOrRegister(View view){
        Intent intent = new Intent(Onboarding02Activity.this, LoginOrRegisterActivity.class);
        startActivity(intent);
    }
}