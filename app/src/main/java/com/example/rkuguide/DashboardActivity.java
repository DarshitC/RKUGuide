package com.example.rkuguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    FirebaseAuth mFirebaseAuth;
    LinearLayout uni, reach, hostel, chat, city, phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().setTitle("RKU");

        mFirebaseAuth = FirebaseAuth.getInstance();

        uni = findViewById(R.id.uni);
        reach = findViewById(R.id.reach);
        hostel = findViewById(R.id.hostel);
        chat = findViewById(R.id.chat);
        city = findViewById(R.id.city);
        phrase = findViewById(R.id.phrase);

        uni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, AboutDept.class);
                startActivity(intent);
            }
        });

        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, Hostel.class);
                startActivity(intent);
            }
        });

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, City.class);
                startActivity(intent);
            }
        });

        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, PhraseActivity.class);
                startActivity(intent);
            }
        });

        reach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(DashboardActivity.this, HowToReachActivity.class);
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 22.24012, 70.90085"));
                //startActivity(intent);
                String url = "https://www.makemytrip.com/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Contact Selection Dialog
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(DashboardActivity.this);
                alertDialog.setTitle("Please Select ");
                alertDialog.setMessage("Who do you want to communicate with?");
                alertDialog.setPositiveButton("International", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        try {
                            intent.setData(Uri.parse("tel:+919328440438"));
                            startActivity(intent);
                        } catch (SecurityException s) {
                            Toast.makeText(DashboardActivity.this, "An error occurred", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                alertDialog.setNegativeButton("National", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        try {
                            intent.setData(Uri.parse("tel:+919925714450"));
                            startActivity(intent);
                        } catch (SecurityException s) {
                            Toast.makeText(DashboardActivity.this, "An error occurred", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                alertDialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //Menu Item Selection Condition
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.abutdeveloper:
                Intent intent = new Intent(DashboardActivity.this, AboutDeveloper.class);
                startActivity(intent);
                return true;
            case R.id.disclaimer:
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(DashboardActivity.this);
                alertDialog.setTitle("Disclaimer");
                alertDialog.setMessage(R.string.disclaimer);
                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDialog.show();
                return true;
            case R.id.yt:
                String yturl = "https://www.youtube.com/channel/UCpBbJF7O4NhsvHxb5IZwWUQ";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(yturl)));
                return true;
            case R.id.insta:
                String instaurl = "https://instagram.com/rkuniversity?igshid=YmMyMTA2M2Y=";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(instaurl)));
                return true;
            case R.id.fb:
                String fburl = "https://www.facebook.com/rkuindia/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(fburl)));
                return true;
            case R.id.li:
                String liurl = "https://in.linkedin.com/school/rkuniversity/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(liurl)));
                return true;
            case R.id.logout:
                logout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void logout() {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(DashboardActivity.this, SignIn.class));
        Toast.makeText(this, "Logout Successfully.", Toast.LENGTH_LONG).show();
    }

    //Exit Alert Dialog
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(DashboardActivity.this);
        alertDialog.setTitle("Exit App");
        alertDialog.setMessage("Do You Want To Exit App?");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alertDialog.show();
    }
}