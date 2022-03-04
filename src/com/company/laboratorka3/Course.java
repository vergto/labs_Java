package com.company.laboratorka3;

import com.company.Library;

import java.util.Arrays;

public class Course {
    private int[] id;
    private int[] id_person; // 1 Если препод 2 если студент
    private int[] grade;
    private String[] name_Course;
    private String[] first_name;
    private String[] last_name;

    public Course(){
        this.id = new int[100];
        this.id_person = new int[100]; // 1 Если препод 2 если студент
        this.grade = new int[100];
        this.name_Course = new String[100];
        this.first_name = new String[100];
        this.last_name = new String[100];
    }
    public void Course_set(int x){
        this.id[x] = x;
        this.id_person[x] = (int) (1 +  Math.random()*2);
        this.name_Course[x] = Library.faculty[(int) (Math.random()*4)];
        this.first_name[x] = Library.first_name[(int) (Math.random()*9)];
        this.last_name[x] = Library.last_name[(int) (Math.random()*3)];

    }

    public int[] getId() {
        return this.id; // почему ссылку на массив
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public int[] getId_person() {
        return id_person;
    }

    public void setId_person(int[] id_person) {
        this.id_person = id_person;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int grade, int x) {
        this.grade[x] = grade;
    }

    public String[] getName_Course() {
        return name_Course;
    }

    public void setName_Course(String[] name_Course) {
        this.name_Course = name_Course;
    }

    public String[] getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String[] first_name) {
        this.first_name = first_name;
    }

    public String[] getLast_name() {
        return last_name;
    }

    public void setLast_name(String[] last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + Arrays.toString(id) +
                ", id_person=" + Arrays.toString(id_person) +
                ", grade=" + Arrays.toString(grade) +
                ", name_Course=" + Arrays.toString(name_Course) +
                ", first_name=" + Arrays.toString(first_name) +
                ", last_name=" + Arrays.toString(last_name) +
                '}';
    }

    public String toString(int x) {
        return "Course{" +
                "id=" + (id[x]) +
                ", id_person=" + (id_person[x]) +
                ", grade=" + (grade[x]) +
                ", name_Course=" + (name_Course[x]) +
                ", first_name=" + (first_name[x]) +
                ", last_name=" + (last_name[x]) +
                '}';
    }
}

