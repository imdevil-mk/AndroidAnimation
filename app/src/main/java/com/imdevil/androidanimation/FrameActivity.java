package com.imdevil.androidanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        final ImageView img = findViewById(R.id.frame_img);
        findViewById(R.id.frame_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setBackgroundResource(R.drawable.frame_anim);
                AnimationDrawable animationDrawable = (AnimationDrawable) img.getBackground();
                animationDrawable.start();

            }
        });
    }
}
