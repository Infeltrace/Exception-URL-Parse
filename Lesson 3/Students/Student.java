package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private Date birth;


    public Student(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void info(){
            System.out.println(" Имя студента: " + getName() + "\n Фамилия студента: " + getSurname() + "\n Дата студента: " + printBirth());
    }

    public String printBirth(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(getBirth());

    }
}
