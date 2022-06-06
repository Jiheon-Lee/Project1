package com.example.project1;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Second extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        viewPager2 = findViewById(R.id.viewPager2);

        ArrayList<DataPage> list = new ArrayList<>();

        list.add(new DataPage(android.R.color.black,"1"));
        list.add(new DataPage(android.R.color.holo_red_light, "2"));
        list.add(new DataPage(android.R.color.holo_green_dark, "3"));
        list.add(new DataPage(android.R.color.holo_orange_dark, "4"));
        list.add(new DataPage(android.R.color.holo_blue_light, "5"));
        list.add(new DataPage(android.R.color.holo_blue_bright, "6"));

        viewPager2.setAdapter(new ViewPagerAdapter(list));

    }
}