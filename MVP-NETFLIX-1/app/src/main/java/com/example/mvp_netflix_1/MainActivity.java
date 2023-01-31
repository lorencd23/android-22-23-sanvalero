package com.example.mvp_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.mvp_netflix_1.contract.LoginContract;
import com.example.mvp_netflix_1.model.pojo.User;
import com.example.mvp_netflix_1.presenter.LoginPresenter;
import com.example.mvp_netflix_1.view.LoginActivity;

public class MainActivity extends AppCompatActivity  {

    private static final int SCREEN = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Handler handler = new Handler();
        // SetTimeOut - setInterval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(                  //Origen y destino objeto que permite pasar de una pantalla a otra
                        getBaseContext(),
                        LoginActivity.class
                );
                startActivity(screenChanger);
            }
        }, 4000);

    }
}