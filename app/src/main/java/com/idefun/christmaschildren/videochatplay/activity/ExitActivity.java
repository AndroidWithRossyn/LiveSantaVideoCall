package com.idefun.christmaschildren.videochatplay.activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.idefun.christmaschildren.videochatplay.R;

public class ExitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

    }
    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
    }
}