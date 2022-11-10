package com.example.rkuguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class SignUp extends AppCompatActivity {

    //    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://rku-guide-47a13-default-rtdb.firebaseio.com/");

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        final EditText username = findViewById(R.id.uName);
        final EditText phone = findViewById(R.id.phNum);
        final EditText email = findViewById(R.id.mail);
        final EditText pass = findViewById(R.id.pwd);
        final EditText cpass = findViewById(R.id.cpwd);
        final Button register = findViewById(R.id.signUpBtn);

        progressDialog = new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // get data from edit text
                final String uName = username.getText().toString().trim();
                final String mail = email.getText().toString().trim();
                final String phNum = phone.getText().toString().trim();
                final String pwd = pass.getText().toString().trim();
                final String cpwd = cpass.getText().toString().trim();

                if (uName.isEmpty()) {
                    username.setError("Enter Username");
                } else if (phNum.isEmpty()) {
                    phone.setError("Enter Phone Number");
                } else if (!mail.matches(emailPattern)) {
                email.setError("Enter Correct Email");
                } else if (pwd.isEmpty() || pwd.length() < 6) {
                    pass.setError("Enter Proper Password");
                } else if (!pwd.equals(cpwd)) {
                    cpass.setError("Password Not Match");
                } else {

                    progressDialog.setMessage("Please Wait While Registration...");
                    progressDialog.setTitle("Registration");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();

                    mAuth.createUserWithEmailAndPassword(mail, pwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                progressDialog.dismiss();
                                Intent intent = new Intent(SignUp.this, DashboardActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                Toast.makeText(SignUp.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                            } else {
                                progressDialog.dismiss();
                                Toast.makeText(SignUp.this, "" + task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    //
//                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
//                        @Override
//                        public void onDataChange(@NonNull DataSnapshot snapshot) {
//                            if (snapshot.hasChild(uName)){
//                                Toast.makeText(SignUp.this, "Username Is Already Registered", Toast.LENGTH_SHORT).show();
//                            }else{
//                                databaseReference.child("users").child(uName).child("Username").setValue(uName);
//                                databaseReference.child("users").child(uName).child("Email").setValue(mail);
//                                databaseReference.child("users").child(uName).child("Phone").setValue(phNum);
//                                databaseReference.child("users").child(uName).child("Password").setValue(pwd);
//
//                                Toast.makeText(SignUp.this, "User Registration Successfully.", Toast.LENGTH_SHORT).show();
//                                finish();
//                            }
//                        }
//
//                        @Override
//                        public void onCancelled(@NonNull DatabaseError error) {
//
//                        }
//                    });
                }
            }
        });
    }

    public void signin(View view) {
        Intent intent = new Intent(SignUp.this, SignIn.class);
        startActivity(intent);
        finish();
    }
}