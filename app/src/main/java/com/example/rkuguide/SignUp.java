package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class SignUp extends AppCompatActivity {

    EditText uName,phNum,mail,pass,cpass;
    Button signin;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        mAuth = FirebaseAuth.getInstance();
        uName= findViewById(R.id.uName);
        phNum = findViewById(R.id.phNum);
        mail = findViewById(R.id.mail);
        pass = findViewById(R.id.pwd);
        cpass = findViewById(R.id.cpwd);
        signin = findViewById(R.id.signInBtn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerNewUser();
            }
        });
    }

    private void registerNewUser() {
        String uname,email,password,cpassword;
        uname = uName.getText().toString();
        email = mail.getText().toString();
        password = pass.getText().toString();
        cpassword = cpass.getText().toString();

        if (TextUtils.isEmpty(uname)){
            Toast.makeText(getApplicationContext(), "Enter Username", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(email)){
            Toast.makeText(getApplicationContext(), "Enter Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void signin(View view) {
        Intent intent = new Intent(SignUp.this, SignIn.class);
        startActivity(intent);
        finish();
    }
}