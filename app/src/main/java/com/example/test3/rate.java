package com.example.test3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class rate extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate);















        ActionBar actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color using parseColor method with color hash code as its parameter
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#0F9D58"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Rate");

        getWindow().setStatusBarColor(getResources().getColor(R.color.green, this.getTheme()));

        actionBar.setDisplayHomeAsUpEnabled(true);      // For back button to be displayed on toolbar
    }

    // For back button on toolbar
    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }
}
