package com.oop.tutorial.studentprofilemaker;

public class Student {
    public String name;
    public String id;
    public String nationality;
    public String dob;
    public String gender;

    public Student(String name, String id, String nationality, String dob, String gender) {
        this.name = name;
        this.id = id;
        this.nationality = nationality;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}' + '\n';
    }
}
