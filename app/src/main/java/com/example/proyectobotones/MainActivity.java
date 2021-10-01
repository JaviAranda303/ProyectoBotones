package com.example.proyectobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reproduceVideo(View vista){
        MediaPlayer reproductor = new MediaPlayer();
        int idSonido = this.getResources().getIdentifier("brasil.mp4", "raw", getPackageName());
    }
}