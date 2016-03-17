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

        Log.d("嘻嘻","what are you doing know");

        Log.d(null,"我在尝试冲突，我是test1, 我要被merge合并");
    }
}
