package oop.demoabstract;

public class PizzaCheese extends Pizza {
    @Override
    void prepare() {
        System.out.println("Pizza Cheese prepare");
    }

    @Override
    void sauce() {
        System.out.println("Pizza Cheese sauce");
    }

    @Override
    void bake() {
        System.out.println("Pizza Cheese bake");
    }

    @Override
    void cut() {
        System.out.println("Pizza Cheese cut");
    }
}
