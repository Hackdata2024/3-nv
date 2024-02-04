package com.example.nammavivasayi;

import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {

    EditText name, email, phone, password;
    Button register;
    TextView login;
    boolean isNameValid, isEmailValid, isPhoneValid, isPasswordValid;
    TextInputLayout nameError, emailError, phoneError, passError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password);
        login = (TextView) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
        nameError = (TextInputLayout) findViewById(R.id.nameError);
        emailError = (TextInputLayout) findViewById(R.id.emailError);
        phoneError = (TextInputLayout) findViewById(R.id.phoneError);
        passError = (TextInputLayout) findViewById(R.id.passError);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
                Intent i = new Intent(Register.this, LoginActivity.class);
                startActivity(i);
            }

        });


    }


    public void SetValidation() {

        if (name.getText().toString().isEmpty()) {
            nameError.setError("TextInputLayout");
            isNameValid = false;
        } else  {
            isNameValid = true;
            nameError.setErrorEnabled(false);
        }


        if (email.getText().toString().isEmpty()) {
            emailError.setError("Email error");
            isEmailValid = false;
        } else if (email.getText().toString().equals(" ")) {
            emailError.setError("error_invalid_email");
            isEmailValid = false;
        } else  {
            isEmailValid = true;
            emailError.setErrorEnabled(false);
        }

        if (phone.getText().toString().isEmpty()) {
            phoneError.setError("phone_error£");
            isPhoneValid = false;
        } else  {
            isPhoneValid = true;
            phoneError.setErrorEnabled(false);
        }

        if (password.getText().toString().isEmpty()) {
            passError.setError("password_error");
            isPasswordValid = false;
        } else if (password.getText().length() < 6) {
            passError.setError("error_invalid_password");
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
            passError.setErrorEnabled(false);
        }

        if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Successfully", Toast.LENGTH_SHORT).show();


        }else   {
            Toast.makeText(getApplicationContext(), "Register Unsuccessfull", Toast.LENGTH_SHORT).show();
        }
        }

    }


