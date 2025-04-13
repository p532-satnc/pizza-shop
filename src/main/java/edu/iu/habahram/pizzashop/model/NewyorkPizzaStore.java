package edu.iu.habahram.pizzashop.model;

public class NewyorkPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = new NewyorkPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}

