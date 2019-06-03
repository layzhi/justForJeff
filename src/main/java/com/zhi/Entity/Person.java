package com.zhi.Entity;

public class Person {

    private int id;
    private String name;
    private int age;
    private String locale;

    public Person(int id, String name, int age, String locale) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.locale = locale;
    }
    public Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
