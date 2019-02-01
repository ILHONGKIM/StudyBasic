package com.nuritelecom.binjan.studybasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void onButtonExitClicked(View v){
        finish();
    }
}
