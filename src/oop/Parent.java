package oop;

public class Parent extends Person {

    private String address;

    // primary constructor
    public Parent(String name, int age) {
        super(name, age);
    }

    // secondary constructor
    public Parent(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }
}
