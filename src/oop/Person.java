package oop;

public class Person {
    // thuộc tính
    String name;
    int age;

    // constructor : phương thức khởi tạo
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    // phương thức : method , function
    String upperCaseName(){
        String newName = name.toUpperCase();
        return newName;
    }
}
