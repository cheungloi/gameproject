package com.example.loicheung.gameproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button level1 = (Button) findViewById(R.id.level1);
        Button level2 = (Button) findViewById(R.id.level2);
        Button level3 = (Button) findViewById(R.id.level3);
        Button level4 = (Button) findViewById(R.id.level4);

        level1.setOnClickListener((View.OnClickListener)this);
        level2.setOnClickListener((View.OnClickListener)this);
        level3.setOnClickListener((View.OnClickListener)this);
        level4.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.level1:
                //trigger two game play fragment
                break;
            case R.id.level2:
                //trigger three game play fragment
                break;
            case R.id.level3:
                //trigger four game play fragment
                break;
            case R.id.level4:
                //trigger five game play fragment
                break;
        }

    }

}
