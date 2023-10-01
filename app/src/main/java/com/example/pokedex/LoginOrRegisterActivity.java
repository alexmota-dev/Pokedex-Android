package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginOrRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);
    }

    public void transitionFromLoginOrRegisterToLogin(View view) {
        Intent intent = new Intent(LoginOrRegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void transitionFromLoginOrRegisterToRegisterActivity(View view) {
        Intent intent = new Intent(LoginOrRegisterActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}