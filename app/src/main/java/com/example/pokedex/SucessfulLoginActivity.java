package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SucessfulLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucessful_login);
    }

    public void transitionFromSucessfulLoginActivityToHomePageActivity(View view){
        Intent intent = new Intent(SucessfulLoginActivity.this, HomePageActivity.class);
        startActivity(intent);
    }
}