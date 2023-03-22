package pizzabsp.Pizzeria;

import pizzabsp.Pizza;

public enum PizzaType {
    CALZ, SALA, HAWA, STAG
}

public abstract class Pizzeria {
    public Pizza makePizza(PizzaType sorte) {
        //Erstellen
        Pizza pizza = createPizza(sorte);
        //Verarbeiten immer gleich
        pizza.bake();
        pizza.cut();
        pizza.pack();
        return pizza;
    }
    //Erstellung spezifisch
    protected abstract pizzabsp.Pizza createPizza(PizzaType sorte);
}







