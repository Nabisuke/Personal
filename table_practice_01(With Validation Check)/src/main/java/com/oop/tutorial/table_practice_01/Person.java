package com.oop.tutorial.table_practice_01;

public class Person {
    private String name;
    private String id;
    private String country;

    public Person(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }
}
