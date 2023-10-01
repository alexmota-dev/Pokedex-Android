package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class RegisterEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_email);
    }
    public void onBackPressedRegisterEmail(View view) {
        super.onBackPressed();
    }
    public void transitionFromRegisterEmailActivityToRegisterPasswordActivity(View view){
        TextInputEditText emailTextInputLayout = findViewById(R.id.tietEmail);
        String email = Objects.requireNonNull(emailTextInputLayout.getText()).toString();

        Intent intent = new Intent(RegisterEmailActivity.this, RegisterPasswordActivity.class);
        intent.putExtra("email", email);
        startActivity(intent);
    }
}