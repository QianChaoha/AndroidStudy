package com.example.designsupport;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        initData();
        viewPager.setAdapter(new MyAdpter(getSupportFragmentManager(), mList));
        tabLayout.setupWithViewPager(viewPager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        final DrawerLayout drawer = findViewById(R.id.drawerLayout);
        findViewById(R.id.btClose).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(Gravity.START);
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        findViewById(R.id.btSecond).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(Gravity.START);
                startActivity(new Intent(MainActivity.this,ThirdActivity.class));
            }
        });
        findViewById(R.id.btThird).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.closeDrawer(Gravity.START);
                startActivity(new Intent(MainActivity.this,TextInputActivity.class));
            }
        });
    }

    private void initData() {
        mList = new ArrayList<>();
        mList.add("111");
        mList.add("222");
        mList.add("333");
        mList.add("111");
        mList.add("222");
        mList.add("333");
        mList.add("111");
        mList.add("222");
        mList.add("333");
    }
}
