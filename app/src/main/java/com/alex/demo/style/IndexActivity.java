package com.alex.demo.style;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.demo1)
    public void onDemo1Clicked() {
        Demo1Activity.start(this);
    }

    @OnClick(R.id.demo2)
    public void onDemo2Clicked() {
        Demo2Activity.start(this);
    }
}
