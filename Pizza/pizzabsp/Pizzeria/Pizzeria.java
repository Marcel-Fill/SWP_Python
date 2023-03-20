import Pizza.Pizza;


enum PizzaType {
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
    protected abstract Pizza createPizza(PizzaType sorte);
}

class BerlinPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(PizzaType sorte) {
        Pizza pizza = null;
        switch(sorte) {
            case SALA:
                pizza = new BerlinSalami();
                break;
            case CALZ:
                pizza = new BerlinCalzone();
                break;
            case HAWA:
                pizza = new BerlinHawaii();
            case STAG: 
                pizza = new BerlinStagioni(); 
            //festgelegter Default-Favourit
            default:
                pizza = new BerlinSalami();
                break;
        }
         return pizza;
    }
}

class HamburgPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(PizzaType sorte) {
        Pizza pizza = null;
        switch(sorte) {
            case SALA:
                pizza = new HamburgSalami();
                break;
            case CALZ:
                pizza = new HamburgCalzone();
                break;
            case HAWA:
                pizza = new HamburgHawaii();
            case STAG: 
                pizza = new HamburgStagioni();
            //festgelegter Default-Favourit
            default:
                pizza = new HamburgSalami();
                break;
        }
        return pizza;
    }
}

class RostockPizzeria extends Pizzeria {

    @Override
    protected Pizza createPizza(PizzaType sorte) {
        Pizza pizza = null;
        switch(sorte) {
            case SALA:
                pizza = new RostockSalami();
                break;
            case CALZ:
                pizza = new RostockCalzone();
                break;
            case HAWA:
                pizza = new RostockHawaii();
            case STAG: 
                pizza = new RostockStagioni();
            //festgelegter Default-Favourit
            default:
                pizza = new RostockSalami();
                break;
        }
        return pizza;
    }
}

