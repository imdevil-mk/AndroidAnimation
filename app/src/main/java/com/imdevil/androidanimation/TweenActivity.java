package com.imdevil.androidanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation translationAnimation;
    private Animation alphaAnimation;
    private Animation animationSet;
    private Animation customAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        img = findViewById(R.id.imageView);
        scaleAnimation = AnimationUtils.loadAnimation(this,R.anim.scale_anim);
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        translationAnimation = AnimationUtils.loadAnimation(this,R.anim.translate_anim);
        alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        animationSet = AnimationUtils.loadAnimation(this,R.anim.anim_set);
        customAnimation = new Rotate3dAnimation(0, 90, 0, 0, 30, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.scale:
                img.startAnimation(scaleAnimation);
                break;
            case R.id.rotate:
                img.startAnimation(rotateAnimation);
                break;
            case R.id.translate:
                //img.startAnimation(translationAnimation);
                findViewById(R.id.scale).startAnimation(translationAnimation);
                break;
            case R.id.alpha:
                img.startAnimation(alphaAnimation);
                break;
            case R.id.animSet:
                img.startAnimation(animationSet);
                break;
            case R.id.frame:
                break;
            case R.id.customAnim:
                img.startAnimation(customAnimation);
                break;
            case R.id.LayoutAnim:
                startActivity(new Intent(this,ListActivity.class));
                overridePendingTransition(R.anim.acitivity_start,R.anim.activity_stop);
            default:
                break;
        }
    }
}
