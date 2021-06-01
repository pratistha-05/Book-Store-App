package com.example.mystore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.cuberto.liquid_swipe.LiquidPager;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_PAGES = 3;
    private LiquidPager pager;

    private ViewPager viewPager;
    //private ScreenSlideAdapter pagerAdapter;


    LottieAnimationView animation;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        appName=findViewById(R.id.text);
        animation=findViewById(R.id.animationView);

        appName.animate().translationY(-1600).setDuration(1000).setStartDelay(2000);
        animation.animate().translationY(2000).setDuration(1000).setStartDelay(2000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(MainActivity.this, SlideScreen.class);
                startActivity(mainIntent);
            }
        }, 3500);


    }
}



