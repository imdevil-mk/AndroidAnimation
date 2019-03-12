package com.imdevil.androidanimation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PropertyActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView img;
    private Button btn_1;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        img = findViewById(R.id.property_img);
        btn = findViewById(R.id.property_btn);
        btn_1 = findViewById(R.id.btn_1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                ObjectAnimator.ofFloat(btn,"translationY",-btn.getHeight()).start();
                break;
        }
    }
}
