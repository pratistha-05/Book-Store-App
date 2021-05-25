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

import com.cuberto.liquid_swipe.LiquidPager;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_PAGES=3;
    private LiquidPager pager;

    private ViewPager viewPager;
   private ScreenSlideAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pager);
        pagerAdapter=new ScreenSlideAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
      /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(MainActivity.this,Onboarding_fragment1.class);
                startActivity(mainIntent);
            }
        }, 3000);
*/

    }

public class ScreenSlideAdapter extends FragmentStatePagerAdapter{

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
        return null;       }

    @Override
    public int getCount() {
        return 3;
    }
}



    }





