package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class MainActivity extends AppCompatActivity {

    private StudentController controller;
    private MainActivity view;
    private StudentWS model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargar view
        view = this;

        // Cargar Model

        // Model + View
        controller = new StudentController(model, view);
        // CASO DE USO -> OBTENER ESTUDIANTE

        Button boton = (Button) findViewById(R.id.buttonLogIn);
        boton.setOnClickListener(v -> {
            EditText email = (EditText) findViewById(R.id.email);
            String mail = email.getText().toString();
            EditText pass = (EditText) findViewById(R.id.pass);
            String password = pass.getText().toString();
            controller.update(mail, password);
        });
        controller.getStudent();

    }

    public void printStudentDetails(Student student) {
        Log.d("MainActivity - EMAIL", student.getEmail());
        Log.d("MainActivity - PASS", student.getPass());
    }


}