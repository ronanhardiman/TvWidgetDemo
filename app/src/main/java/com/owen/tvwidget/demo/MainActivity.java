package com.owen.tvwidget.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.tv.boost.widget.TvHorizontalScrollView;
import com.tv.boost.widget.tablayout.TvTabLayout;


public class MainActivity extends AppCompatActivity {
    
    private Button mButton;
    private TvHorizontalScrollView mHorizontalScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mHorizontalScrollView = (TvHorizontalScrollView) findViewById(R.id.smooth_horizontal_scrollview);
        mHorizontalScrollView.setScrollerDuration(700);

        TvTabLayout mTabLayout = (TvTabLayout) findViewById(R.id.tablayout);
        mTabLayout.setScaleValue(1.2f);
        TvTabLayout mTabLayout2 = (TvTabLayout) findViewById(R.id.tablayout2);
        TvTabLayout mTabLayout3 = (TvTabLayout) findViewById(R.id.tablayout3);
        mTabLayout3.setScaleValue(1.2f);
        for(int i=0; i<15; i++) {
            mTabLayout.addTab(mTabLayout.newTab().setText("标题"+i), i == 0);
            mTabLayout2.addTab(mTabLayout2.newTab().setText("标题"+i));
            mTabLayout3.addTab(mTabLayout3.newTab().setText("标题"+i));
        }
        
        
    }
}
