package com.pactise.fragmenttask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager =getSupportFragmentManager();

        ColorFragment colorFragmentTop = new ColorFragment(Color.getColors());
        manager.beginTransaction().add(R.id.top_fr, colorFragmentTop).commit();

        ColorFragment colorFragmentCentre = new ColorFragment(Color.getColors());
        manager.beginTransaction().add(R.id.centre_fr, colorFragmentCentre).commit();

        ColorFragment colorFragmentBottom = new ColorFragment(Color.getColors());
        manager.beginTransaction().add(R.id.bottom_fr, colorFragmentBottom).commit();
    }
}