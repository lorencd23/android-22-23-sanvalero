package com.example.mvp_simpson_01.update_simpson.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp_simpson_01.R;
import com.example.mvp_simpson_01.entities.pojo.Simpson;
import com.example.mvp_simpson_01.update_simpson.UpdateSimpsonContract;
import com.example.mvp_simpson_01.update_simpson.presenter.UpdateSimpsonPresenter;

import java.util.ArrayList;

public class UpdateSimpsonActivity extends AppCompatActivity implements UpdateSimpsonContract.View {

    private UpdateSimpsonPresenter uptSimpsonPresenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upt_simpson);
        
        initComponents();
        initPresenter();
        initData();
        uptSimpsonPresenter.uptSimpson(null);
    }

    public void initComponents() {
    }

    public void initPresenter() {
        uptSimpsonPresenter = new UpdateSimpsonPresenter(this);
    }

    public void initData() {
        uptSimpsonPresenter.uptSimpson(null);
    }

    @Override
    public void successUpdateSimpson(ArrayList<Simpson> uptSimpson) {
        Toast.makeText(this, "Actualizado con exito: " + uptSimpson.size() + " lineas actualizadas", Toast.LENGTH_LONG).show();
    }

    @Override
    public void failureUpdateSimpson(String error) {
        Toast.makeText(this, "No se ha podido actualizar", Toast.LENGTH_SHORT).show();
    }
}
