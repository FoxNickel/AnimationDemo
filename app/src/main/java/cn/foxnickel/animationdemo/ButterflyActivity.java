package cn.foxnickel.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class ButterflyActivity extends AppCompatActivity {

    private float currentX;
    private float currentY;
    private float nextX;
    private float nextY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterfly);

        ImageView iv = findViewById(R.id.iv);
        TranslateAnimation animation = new TranslateAnimation(currentX, nextX, currentY, nextY);
    }
}
