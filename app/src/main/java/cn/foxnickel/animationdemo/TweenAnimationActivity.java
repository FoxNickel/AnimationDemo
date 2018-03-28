package cn.foxnickel.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        Button button = findViewById(R.id.bt);
        Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        button.startAnimation(alphaAnimation);
    }
}
