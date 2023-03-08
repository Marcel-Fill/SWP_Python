package pizzabsp.Pizzeria;
import pizzabsp.Pizzen.HamburgSalami;

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
