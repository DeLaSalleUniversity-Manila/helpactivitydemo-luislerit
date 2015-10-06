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

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView init = (ImageView) findViewById(R.id.imageView);
        final Animation fadein = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_in);
        final Animation fadeout = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);
        final Animation rotate = AnimationUtils.loadAnimation(getBaseContext(), R.anim.delay);
        init.setAnimation(fadeout);
        init.setAnimation(fadein);
        init.setAnimation(rotate);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));

                finish();
            }
        }
                ,4500); //delay






    }

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
