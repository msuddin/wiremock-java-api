package com.thetestroom;

public class Person {

    String name;
    int age;

    Person() {}

    Person(String name) {
        this.name = name;
        this.age = 10;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
