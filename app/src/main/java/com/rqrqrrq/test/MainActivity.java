package com.rqrqrrq.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Main","LLLLLLLLLA");

        Log.d("嘻嘻","I will give you some color to see see");

        Log.d(null,"大家好，我是master，我要跟test进行冲突，演示合并");
    }
}
