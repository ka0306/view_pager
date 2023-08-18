package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       @SuppressLint({"MissingInflatedId", "LocalSuppress"})
       ViewPager2 viewPager2=findViewById(R.id.viewpager);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TabLayout tabLayout=findViewById(R.id.tablayout);

        viewpageradapter adapter=new viewpageradapter(getSupportFragmentManager(),getLifecycle());
        adapter.addfragment(new callfragment(),"call");
        adapter.addfragment(new hatfragment(),"chat");
        adapter.addfragment(new homefragment(),"home");
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> {
            tab.setText(adapter.getPageTitle(position));
        }).attach();

    }
}