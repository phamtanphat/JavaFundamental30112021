package oop;

import oop.demoabstract.Pizza;
import oop.demoabstract.PizzaCheese;
import oop.demoabstract.PizzaStore;
import oop.demoabstract.PizzaVegetable;

public class Main {
    public static void main(String[] args) {

        // 1 object => 1 instance
        // heap memory
//        Person teo = new Person("Nguyễn Văn Tèo",5);
//        teo.setName("");
//
//        System.out.println("Tên : " + teo.upperCaseName());
//
//        Person ty = new Person("Nguyễn Văn Tý",5);

//        Parent dad = new Parent("Mr . A",40,"Quận 10");
//        System.out.println(dad.upperCaseName());

        // Tính chất hương đối tượng

        // Đóng gói
        // Kế thừa
        // Đa hình
        // Trườu tượng

        // access modifier : phạm vi truy cập
        // public , private


        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(new PizzaVegetable());
    }
}
