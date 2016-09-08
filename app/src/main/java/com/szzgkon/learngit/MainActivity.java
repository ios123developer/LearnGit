package com.szzgkon.learngit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   private People people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people.setHobby("抽烟，喝酒，烫头");
        people.setName("于谦");
        people.toString();
    }
}
