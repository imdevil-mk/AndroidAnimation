package com.imdevil.androidanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tween:
                startActivity(new Intent(this, TweenActivity.class));
                break;
            case R.id.frame:
                startActivity(new Intent(this, FrameActivity.class));
                break;
            case R.id.property:
                startActivity(new Intent(this, PropertyActivity.class));
                break;
            default:
                break;
        }
    }
}
