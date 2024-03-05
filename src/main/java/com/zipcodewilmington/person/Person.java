package com.zipcodewilmington.person;
// NOT FINISHED NEED TO ADD NEW FIELDS

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int birthYear;

    public Person(String name, int age, int birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.birthYear = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.name = "";
        this.age = age;
        this.birthYear = Integer.MAX_VALUE;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
