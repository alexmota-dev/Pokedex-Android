package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class RegisterPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_password);
    }
    public void onBackPressedRegisterPassword(View view){
        super.onBackPressed();
    }

    public void transitionFromRegisterPasswordActivityToRegisterUsernameActivity(View view){
        TextInputEditText passwordTextInputLayout = findViewById(R.id.tietPassword);
        String password = Objects.requireNonNull(passwordTextInputLayout.getText()).toString();
        Intent intentAnterior = getIntent();
        String email = intentAnterior.getStringExtra("email");

        Intent intent = new Intent(RegisterPasswordActivity.this, RegisterUsernameActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}