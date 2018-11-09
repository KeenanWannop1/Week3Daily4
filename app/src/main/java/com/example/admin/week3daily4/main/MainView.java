package com.example.admin.week3daily4.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin.week3daily4.R;

public class MainView extends AppCompatActivity implements MainContract.MvpView{
    private MainPresenter mainPresenter;
    Button btnStart;
    Button btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
    }

    public void startAndStopService(View view) {
        switch(view.getId()){
            case R.id.btnStart:
                break;
            case R.id.btnStop:
                break;
        }

    }
}
