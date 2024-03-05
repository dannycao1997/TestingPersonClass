package com.zipcodewilmington.person;



/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private double birthYear;

    public Person(String name, int age, double birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.birthYear = Double.MIN_VALUE;
    }

    public Person(int age) {
        this.name = "";
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
        this.birthYear = Double.MIN_VALUE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthYear(double birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Double getBirthYear() {
        return this.birthYear;
    }
}

