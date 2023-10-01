package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class RegisterUsernameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_username);
    }

    public void onBackPressedRegisterUsername(View view){
        super.onBackPressed();
    }

    public void transitionFromRegisterUsernameActivityToSuccessfulRegistrationActivity(View view){
        TextInputEditText usernameTextInputLayout = findViewById(R.id.tietUsername);
        String username = Objects.requireNonNull(usernameTextInputLayout.getText()).toString();
        Intent intentAnterior = getIntent();
        String email = intentAnterior.getStringExtra("email");
        String password = intentAnterior.getStringExtra("password");

        Intent intent = new Intent(RegisterUsernameActivity.this, SuccessfulRegistrationActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        intent.putExtra("username", username);
        startActivity(intent);
    }
}