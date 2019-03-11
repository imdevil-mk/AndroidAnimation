package com.imdevil.androidanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView rv;
    private Adapter adapter;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        list = new ArrayList<>();
        rv = findViewById(R.id.recycler_view);
        for (int i = 0;i<20;i++){
            list.add("条目： "+ i);
        }

        adapter = new Adapter(this,list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        /**以下代码通过代码设置动画**/
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_layout);
//        LayoutAnimationController controller = new LayoutAnimationController(animation);
//        rv.setLayoutAnimation(controller);

    }
}
