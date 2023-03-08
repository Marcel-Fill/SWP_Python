package pizzabsp.Pizzen;
import pizzabsp.*;

public class BerlinHawaii implements Pizza {

    @Override
    public void bake(){
        System.out.println( "Pizza Hawaii of Pizza Berlin is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Pizza Hawaii of Pizza Berlin is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println( "Pizza Hawaii of Pizza Berlin is beeing packaged");
    }

}
