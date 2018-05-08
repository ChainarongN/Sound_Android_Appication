package com.example.ngz.sound_project;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity3 extends AppCompatActivity {

    MediaPlayer my_sound;
    ImageButton imb1,imb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        setTitle("เพลง ขอ");
        imb1 = (ImageButton)findViewById(R.id.imageButton);
        imb2 = (ImageButton)findViewById(R.id.imageButton2);

    }

    public void play1(View view) {
        my_sound = MediaPlayer.create(this,R.raw.kou_edit);
        my_sound.start();
        imb1.setEnabled(false);
    }

    public void pause1(View view) {
        my_sound.pause();
        imb1.setEnabled(true);
    }
}
