package com.example.luis.breastawarenessapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        final ImageView init = (ImageView) findViewById(R.id.imageView);
        final TextView n1 = (TextView) findViewById(R.id.textView14);
        final TextView n2 = (TextView) findViewById(R.id.textView15);
        final Animation slidein = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_slide_in_top);
        final Animation fadeout = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);
        final Animation rotate = AnimationUtils.loadAnimation(getBaseContext(), R.anim.delay);



        init.startAnimation(rotate);
        n1.startAnimation(slidein);
        n2.startAnimation(slidein);
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
            init.startAnimation(fadeout);
                n1.startAnimation(fadeout);
                n2.startAnimation(fadeout);
                finish();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }



    //new Handler().postDelayed(new Runnable() {
    //    public void run() {
    //       startActivity(new Intent(Splash.this, MainActivity.class));

    //      finish();
    //}
    //}
    //      ,4000); //delay





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
