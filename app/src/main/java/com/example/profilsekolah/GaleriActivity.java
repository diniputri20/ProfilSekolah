package com.example.profilsekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class GaleriActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }

    public void albumpmr(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumpmrActivity.class);
        startActivity(intent);
    }

    public void albumhutri(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumKegiatanHutri.class);
        startActivity(intent);
    }

    public void albumpramuka(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumpramukaActivity.class);
        startActivity(intent);
    }
}