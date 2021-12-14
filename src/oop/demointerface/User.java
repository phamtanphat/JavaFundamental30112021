package oop.demointerface;

public class User implements Printable {
    String name;
    int age;


    @Override
    public void print() {
        System.out.println("Name " + name + " ,age : " + age);
    }

}
