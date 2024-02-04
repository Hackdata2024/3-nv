package com.example.nammavivasayi;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btClickMe;
     TextView textViewCreateAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.Password);
         textViewCreateAccount = findViewById(R.id.textviewCreateAccount);

        btClickMe = findViewById(R.id.btClickMe);
        btClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals(" ") && password.getText().toString().equals(" ")){


                    Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL!", Toast.LENGTH_SHORT).show();
                }else

                    Toast.makeText(LoginActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();



            }


        });
    }
    }