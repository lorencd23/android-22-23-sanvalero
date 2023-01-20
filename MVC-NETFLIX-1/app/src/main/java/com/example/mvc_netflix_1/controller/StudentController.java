package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivity;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class StudentController {
    private StudentWS model;
    private MainActivity view;
    private String email;

    public StudentController(StudentWS model, MainActivity view){
        this.model = model;
        this.view = view;
    }

    public void getStudent(){
        // THREADS -> RETROFIT 2
        // IRÍA A WEBSERVICE REST + COGERÍA DATA STUDENT + Y VOLVERÍA
        Student student = model.getStudentWS();
        view.printStudentDetails(student);
    }

    public void update(String email, String pass){
        Student student = model.getStudentWS();
        student.setEmail(email);
        student.setPass(pass);
    }
}
