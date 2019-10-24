package com.bryan1.laptoparena.model;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bryan1.laptoparena.R;
import com.bumptech.glide.Glide;

public class LaptopDetail extends AppCompatActivity
{
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_PRICES = "extra_prices";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_PHOTO = "extra_photo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_detail);

        TextView tvName = findViewById(R.id.tv_laptop_name);
        TextView tvPrices = findViewById(R.id.tv_laptop_prices);
        TextView tvDetail = findViewById(R.id.tv_laptop_detail);
        ImageView tvPhoto = findViewById(R.id.img_laptop_photo);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String prices = getIntent().getStringExtra(EXTRA_PRICES);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        Glide.with(this).load(photo).into(tvPhoto);
        tvName.setText(name);
        tvPrices.setText(prices);
        tvDetail.setText(detail);
        getSupportActionBar().setTitle("Laptop Details");
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
