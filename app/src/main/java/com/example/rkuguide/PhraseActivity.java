package com.example.rkuguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;

public class PhraseActivity extends AppCompatActivity {

    Button howareen,howareguj;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        getSupportActionBar().setTitle("Phrases");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        howareen = findViewById(R.id.howareyouen);
        howareguj = findViewById(R.id.howareyouguj);
    }

    public void howareen(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujhowareyou);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }
    public void howareguj(View view){
        mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void whatareyou(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhatareyoudoinghere);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void whatareyouguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whatareyoudoinghere);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void canyouhelp(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujcanyouhelpme);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void canyouhelpguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.canyouhelpme);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void wherefrom(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwheredoyoucomefrom);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void wherefromguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.wheredoyoucomefrom);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void dideat(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujdidyoudoneyourfood);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void dideatguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.didyoudoneyourfood);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void whatlike(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhatdoyoulikemore);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void whatlikeguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whatdoyoulikemore);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void helpmess(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujhelpmetogotomess);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void helpmessguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.helpmetogotomess);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void helpcanteen(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujhelpmetogotocanteen);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void helpcanteenguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.helpmetogotocanteen);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void whichdept(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhichdepartmentareyouin);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void whichdeptguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whichdepartmentareyouin);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void airport(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhattodotogettotheairport);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void airportguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whattodotogettotheairport);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void contactme(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujpleasecontactmewhen);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void contactmeguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.pleasecontactmewhen);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void famousplace(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhatisthefamousplacehere);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void famousplaceguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whatisthefamousplacehere);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void name(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhatisyourname);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void nameguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whatisyourname);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void sublike(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.gujwhichsubjectdoyoulikemore);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }

    public void sublikeguj(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.whichsubjectdoyoulikemore);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        Toast.makeText(this, "Audio Playing", Toast.LENGTH_SHORT).show();
    }
}