package com.example.ngz.sound_project;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {

    MediaPlayer my_sound;
    ImageButton imb1,imb2;
    ImageView imv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        setTitle("เพลง เธอรักฉันเพราะอะไร");
        imb1 = (ImageButton)findViewById(R.id.imageButton9);
        imb2 = (ImageButton)findViewById(R.id.imageButton11);
        imv1 = (ImageView)findViewById(R.id.imageView);


    }

    public void play(View view) {
        my_sound = MediaPlayer.create(this,R.raw.rak_p);
        my_sound.start();
        imb1.setEnabled(false);
    }

    public void pause(View view) {
        my_sound.pause();
        imb1.setEnabled(true);
    }
}
