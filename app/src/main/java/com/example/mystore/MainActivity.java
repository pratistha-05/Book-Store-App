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

    ImageView background;
    LottieAnimationView animation;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        /*background=findViewById(R.id.imageView);
        appName = findViewById(R.id.textView);
        animation=findViewById(R.id.animationView);

        viewPager = findViewById(R.id.pager);

        pagerAdapter=new ScreenSlideAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);



        background.animate().translationY(-3000).setDuration(1000).setStartDelay(4000);
        appName.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
        animation.animate().translationY(2000).setDuration(1000).setStartDelay(4000);
       viewPager.setVisibility(View.INVISIBLE);

          */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(MainActivity.this, SlideScreen.class);
                startActivity(mainIntent);
            }
        }, 3000);


    }
}



   /* private class ScreenSlideAdapter extends FragmentStatePagerAdapter{

        public ScreenSlideAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch(position) {

                case 0:
                    Onboarding_fragment1 tab1=new Onboarding_fragment1();
                    return tab1;
                case 1:
                    Onboading_fragment2 tab2=new Onboading_fragment2();
                    return tab2;
                case 2:
                    Onboarding_fragment3 tab3=new Onboarding_fragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }




    }


/*   <androidx.viewpager.widget.ViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>

 */


