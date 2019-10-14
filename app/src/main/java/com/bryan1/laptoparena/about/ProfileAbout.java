package com.bryan1.laptoparena.about;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bryan1.laptoparena.R;

public class ProfileAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_about);
        getSupportActionBar().setTitle("Profile");
    }
}
