package com.example.pokedex;

import static android.text.TextUtils.isEmpty;

import static java.util.Objects.isNull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView usernameText = findViewById(R.id.usernameText);
        Intent intent = getIntent();
        if(isNull(intent)) {
            String textDefault = "Chegou Vazio";
            usernameText.setText(textDefault);
        }
        else{
            String email = intent.getStringExtra("email");
            String password = intent.getStringExtra("password");
            String username = intent.getStringExtra("username");
            usernameText.setText(username);
        }
    }
}