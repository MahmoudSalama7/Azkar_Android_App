package com.example.azkar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewPager2 = findViewById(R.id.viewpager);

        List<sliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new sliderItem(R.drawable.q1));
        sliderItems.add(new sliderItem(R.drawable.q2));
        sliderItems.add(new sliderItem(R.drawable.q3));
        sliderItems.add(new sliderItem(R.drawable.q4));
        sliderItems.add(new sliderItem(R.drawable.q5));
        sliderItems.add(new sliderItem(R.drawable.q6));
        sliderItems.add(new sliderItem(R.drawable.q7));
        sliderItems.add(new sliderItem(R.drawable.q8));
        sliderItems.add(new sliderItem(R.drawable.q9));
        sliderItems.add(new sliderItem(R.drawable.q10));
        sliderItems.add(new sliderItem(R.drawable.q11));
        sliderItems.add(new sliderItem(R.drawable.q12));
        sliderItems.add(new sliderItem(R.drawable.q13));
        sliderItems.add(new sliderItem(R.drawable.q14));
        sliderItems.add(new sliderItem(R.drawable.q15));
        sliderItems.add(new sliderItem(R.drawable.q16));
        sliderItems.add(new sliderItem(R.drawable.q17));
        sliderItems.add(new sliderItem(R.drawable.q19));
        sliderItems.add(new sliderItem(R.drawable.q20));

        viewPager2.setAdapter(new sliderAdapter(sliderItems,viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_ALWAYS);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);

    }
    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };
}