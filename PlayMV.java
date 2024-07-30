package com.example.test2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class PlayMV extends AppCompatActivity {
    List<String> data = new ArrayList<>();
Button play, stop, pre, next;
MediaPlayer mp;
ListView lvmusic;
ArrayAdapter adapter;
int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_mv);

        play = (Button) findViewById(R.id.btresume);
        stop = (Button) findViewById(R.id.btstop);
        pre = (Button) findViewById(R.id.prem);
        next = (Button) findViewById(R.id.nextm);
        lvmusic = (ListView) findViewById(R.id.lvmusic);
        data.add("Hoàng đế trở về");
        data.add("Âm thầm bên em");
        data.add("Phía sau một cô gái");
        data.add("Lengend Never Die");
        data.add("Đánh đổi");
        adapter = new ArrayAdapter(PlayMV.this, android.R.layout.simple_list_item_1, data);
        lvmusic.setAdapter(adapter);
        lvmusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s = data.get(i).toString();
                if (mp != null && mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }

                if(s.equals("Hoàng đế trở về") ){
                    mp = MediaPlayer.create(PlayMV.this, R.raw.hdtv);
                    mp.start();
                }
                else if(s.equals("Âm thầm bên em") ){
                    mp = MediaPlayer.create(PlayMV.this, R.raw.atbe);
                    mp.start();
                }
                else if(s.equals("Phía sau một cô gái")){
                    mp = MediaPlayer.create(PlayMV.this, R.raw.ps1cg);
                    mp.start();
                }
                else if(s.equals("Lengend Never Die")){
                    mp = MediaPlayer.create(PlayMV.this, R.raw.lnd);
                    mp.start();
                }
                else if(s.equals("Đánh đổi")){
                    mp = MediaPlayer.create(PlayMV.this, R.raw.dd);
                    mp.start();
                }
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.isPlaying();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }
//    private void playNextSong() {
//        c = (c + 1) % lvmusic.size();
//        mp.(c);


}