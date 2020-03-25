package com.tasfia.rhymes;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    ImageView imgPoem;
    TextView txtName, txtLyrics;
    Button btnPlay,btnStop;

    MediaPlayer player;

    boolean isPlaying=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        imgPoem = findViewById(R.id.img_poem);
        txtName = findViewById(R.id.txt_name);
        txtLyrics = findViewById(R.id.txt_lyrics);


        String getId = getIntent().getExtras().getString("id");
        if (getId.equals("one")) {
            imgPoem.setImageResource(R.drawable.fish);
            txtName.setText("12345 Once I caught A fish Alive");
            txtLyrics.setText(R.string.poem1);
            player = MediaPlayer.create(DetailsActivity.this, R.raw.fish);


        } else if (getId.equals("two")) {
            imgPoem.setImageResource(R.drawable.alphabet);
            txtName.setText("Alphabet Song");
            txtLyrics.setText(R.string.poem2);
            player = MediaPlayer.create(DetailsActivity.this, R.raw.abc);


        } else if (getId.equals("three")) {
            imgPoem.setImageResource(R.drawable.blacksheep);
            txtName.setText("Baa Baa Black Sheep");
            txtLyrics.setText(R.string.poem3);
            player = MediaPlayer.create(DetailsActivity.this,R.raw.blacksheep);


        } else if (getId.equals("four")) {
            imgPoem.setImageResource(R.drawable.humpty);
            txtName.setText("Humpty Dumpty");
            txtLyrics.setText(R.string.poem4);
            player = MediaPlayer.create(DetailsActivity.this,R.raw.humpty);


        } else if (getId.equals("five")) {
            imgPoem.setImageResource(R.drawable.jack);
            txtName.setText("Jack and Jill");
            txtLyrics.setText(R.string.poem5);
            player = MediaPlayer.create(DetailsActivity.this,R.raw.jack);


        } else if (getId.equals("six")) {
            imgPoem.setImageResource(R.drawable.twinkle);
            txtName.setText("Twinkle Twinkle Little Star");
            txtLyrics.setText(R.string.poem6);
            player = MediaPlayer.create(DetailsActivity.this,R.raw.star);


        }




        btnPlay=findViewById(R.id.btn_play);
     //   btnPause=findViewById(R.id.btn_pause);
        btnStop=findViewById(R.id.btn_stop);




        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPlaying==false)
                {
                    player.start();
                    isPlaying=true ;//initialize krtese
                }
            }
        });

      /*  btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPlaying==true)
                {
                    player.pause();
                    isPlaying=false; //initialize krtese
                }
            }
        });  */
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPlaying==true)
                {
                    player.stop();
                    isPlaying=false; //initialize krtese
                }


                DetailsActivity.this.finish();
            }
        });
    }
}




