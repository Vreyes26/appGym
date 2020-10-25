package com.example.asyngactivityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Menu_act extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] images = {R.drawable.a,R.drawable.b,R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        vf = (ViewFlipper)findViewById(R.id.slider);

        for(int i = 0; i < images.length; i++)
        {
            flip_image(images[i]);
        }
    }

    //configuracion slider.
    public void flip_image(int i)
    {
        ImageView view =new ImageView(this);
        view.setBackgroundResource(i); // añadir arreglo al ImageView

        // configuracion slider
        vf.addView(view);
        vf.setAutoStart(true);
        vf.setFlipInterval(2800);

        // sentido slider
        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}