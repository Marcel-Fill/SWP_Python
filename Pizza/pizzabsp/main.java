package pizzabsp;
import pizzabsp.*;
import pizzabsp.Pizzeria.BerlinPizzeria;
import pizzabsp.Pizzeria.Pizzeria;;


public class Main {
    public static void main(String []args) {
        //Berlin
        BerlinPizzeria berlinPizzeria = new BerlinPizzeria();
        Pizza BerlinSalami = berlinPizzeria.makePizza(PizzaType.CALZ);

        //Hamburg
        Pizzeria hamburgPizzeria = new HamburgPizzeria();
        Pizza HamburgCalzone = hamburgPizzeria.makePizza(PizzaType.SALA);

        //Rostock
        Pizzeria rostockPizzeria= new RostockPizzeria();
        Pizza rostockStagi = new RostockPizzeria.makePizza(PizzaType.STAG);
    }

}