package com.bashellwang.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        OkHttpClient.Builder builder = new OkHttpClient.Builder();

    }
}