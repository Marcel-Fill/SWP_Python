package pizzabsp.Pizzeria;
import pizzabsp.Pizza;
import pizzabsp.Pizzen.*;

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