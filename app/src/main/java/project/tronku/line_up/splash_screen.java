package project.tronku.line_up;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import java.util.Timer;

public class splash_screen extends AppCompatActivity {

    private View lineb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        lineb = findViewById(R.id.line_b);
        ObjectAnimator animation_x1=ObjectAnimator.ofFloat(lineb,"translationX",500f, 0f);
        animation_x1.setInterpolator(new AccelerateInterpolator());
        animation_x1.setDuration(400);
        animation_x1.start();
        ObjectAnimator animation_x2=ObjectAnimator.ofFloat(findViewById(R.id.line_d),"translationX",-500f, 0f);
        animation_x2.setInterpolator(new AccelerateInterpolator());
        animation_x2.setDuration(400);
        animation_x2.start();
        ObjectAnimator animation_y1=ObjectAnimator.ofFloat(findViewById(R.id.line_a),"translationY",-500f, 0f);
        animation_y1.setInterpolator(new AccelerateInterpolator());
        animation_y1.setDuration(400);
        animation_y1.start();
        ObjectAnimator animation_y2=ObjectAnimator.ofFloat(findViewById(R.id.line_c),"translationY",500f, 0f);
        animation_y2.setInterpolator(new AccelerateInterpolator());
        animation_y2.setDuration(400);
        animation_y2.start();

        AlphaAnimation line=new AlphaAnimation(0.0f,1.0f);
        line.setDuration(250);
        line.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
