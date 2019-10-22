package com.example.tabbedproject;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tabbedproject.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }
}

/**
 * <androidx.cardview.widget.CardView
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content">
 *
 *         <ImageView
 *             android:id="@+id/song_image"
 *             android:layout_width="60dp"
 *             android:layout_height="60dp"
 *             android:src="@drawable/ic_launcher_foreground"
 *             android:layout_margin="8dp"
 *             android:background="#DA0C0C"/>
 *
 *     </androidx.cardview.widget.CardView>
 *
 *     <LinearLayout
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content"
 *         android:orientation="vertical">
 *
 *         <TextView
 *             android:id="@+id/song_name"
 *             android:layout_width="wrap_content"
 *             android:layout_height="wrap_content"
 *             android:layout_marginTop="16dp" />
 *
 *         <TextView
 *             android:id="@+id/song_duration"
 *             android:layout_width="wrap_content"
 *             android:layout_height="wrap_content" />
 *
 *     </LinearLayout>*/