package com.example.yvtc.yvd120604;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        it = new Intent(MainActivity.this, MyService.class);
        startService(it);
    }
    public void click2(View v)
    {
        stopService(it);
    }
}
