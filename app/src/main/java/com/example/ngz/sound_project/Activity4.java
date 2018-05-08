package com.example.ngz.sound_project;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity4 extends AppCompatActivity {

    MediaPlayer my_sound;
    ImageButton imb1, imb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        setTitle("เพลง บอกรัก");
        imb1 = (ImageButton) findViewById(R.id.imageButton3);
        imb2 = (ImageButton) findViewById(R.id.imageButton4);

    }

    public void pause2(View view) {
        my_sound.pause();
        imb1.setEnabled(true);
    }


    public void play2(View view) {

        my_sound = MediaPlayer.create(this,R.raw.bok);
        my_sound.start();
        imb1.setEnabled(false);
    }
}
