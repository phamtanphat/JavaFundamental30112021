package oop;

public class Main {
    public static void main(String[] args) {

        // 1 object => 1 instance
        // heap memory
        Person teo = new Person("Nguyễn Văn Tèo",5);

        System.out.println("Tên : " + teo.name);
        System.out.println("Tuổi : " + teo.age);

        Person ty = new Person("Nguyễn Văn Tý",5);
    }
}
