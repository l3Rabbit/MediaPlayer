package com.example.admin.player;

/**
 * Created by Admin on 2/12/2559.
 */

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BasicScreenActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_screen);

        Button one = (Button)this.findViewById(R.id.b1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.water);
        one.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
        Button two = (Button)this.findViewById(R.id.b2);
        two.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mp.pause();
            }
        });





        Button AAA = (Button)this.findViewById(R.id.a1);
        final MediaPlayer mo = MediaPlayer.create(this, R.raw.fb);
        AAA.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mo.start();
            }
        });
        Button BBB = (Button)this.findViewById(R.id.a2);
        BBB.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mo.pause();
            }
        });



    }


}
