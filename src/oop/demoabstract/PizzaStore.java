package oop.demoabstract;

public class PizzaStore {

    public void orderPizza(Pizza pizza){
        pizza.prepare();
        pizza.sauce();
        pizza.bake();
        pizza.cut();
    }
}
