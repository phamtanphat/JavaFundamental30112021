package oop;

public class Person {
    // thuộc tính
    private String name;
    private int age;

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

    // setter , getter
    public void setName(String name){
        if (name.equals("")){
            System.out.println("Giá trị rỗng");
        }else{
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
