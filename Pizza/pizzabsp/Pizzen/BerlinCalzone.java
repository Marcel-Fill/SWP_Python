package pizzabsp.Pizzen;

import pizzabsp.Pizza;

public class BerlinCalzone implements Pizza {
    @Override
    public void bake(){
        System.out.println( "Pizza Calzone of Pizza Berlin is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Pizza Calzone of Pizza Berlin is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println( "Pizza Calzone of Pizza Berlin is beeing packaged");
    }

}