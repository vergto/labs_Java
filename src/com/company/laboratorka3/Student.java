package com.company.laboratorka3;

import com.company.Library;

import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    private int id;
    private String first_name;
    private String last_name;
    private String patronymic_name;
    private String date;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private int group;

    public Student(int x){
        this.id = x;
        this.first_name = Library.first_name[(int) (Math.random()*9)];
        this.last_name = Library.last_name[(int) (Math.random()*3)];
        this.patronymic_name = Library.patronymic_name[(int) (Math.random()*2)];
        this.date = Library.getDate();
        this.address = "Address" + (int) (Math.random()*9);
        this.phone = Library.getRandomPhone();
        this.faculty = Library.faculty[(int) (Math.random()*4)];
        this.course = (int) (Math.random()*6);
        this.group = (int) (Math.random()*4);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", patronymic_name='" + patronymic_name + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPatronymic_name() {
        return patronymic_name;
    }

    public void setPatronymic_name(String patronymic_name) {
        this.patronymic_name = patronymic_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = String.valueOf(date);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}