package oop;

public class Main {
    public static void main(String[] args) {

        // 1 object => 1 instance
        // heap memory
        Person teo = new Person("Nguyễn Văn Tèo",5);

        System.out.println("Tên : " + teo.upperCaseName());

        Person ty = new Person("Nguyễn Văn Tý",5);

        // Tính chất hương đối tượng

        // Đóng gói
        // Kế thừa
        // Đa hình
        // Trườu tượng

        // access modifier : phạm vi truy cập
        // public , private
    }
}
