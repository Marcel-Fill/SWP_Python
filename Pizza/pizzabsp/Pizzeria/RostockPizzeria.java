package pizzabsp.Pizzeria;

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
