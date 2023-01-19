package com.example.mvc_netflix_1.model.pojo;

public class Student {
    private String name;
    private String surname;
    private String email;
    private String pass;

    //PARTE DE EMAIL Y PASS
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Strign getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    // PARTE DE NOMBRE Y APELLIDOS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
