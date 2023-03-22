package pizzabsp;

public interface Pizza {
    void bake();
    void cut();
    void pack();
}







class BerlinStagioni implements Pizza {

    @Override
    public void bake(){
        System.out.println( "Pizza Stagioni of Pizza Berlin is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Pizza Stagioni of Pizza Berlin is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println( "Pizza Stagioni of Pizza Berlin is beeing packaged");
    }

}



class HamburgSalami implements Pizza {

    @Override
    public void bake(){
        System.out.println("Salamipizza of Pizza Hamburg is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println("Salamipizza of Pizza Hamburg is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println("Salamipizza of Pizza Hamburg is beeing packaged");
    }

}

class HamburgCalzone implements Pizza {

    @Override
    public void bake(){
        System.out.println( "Calzone of Pizza Hamburg is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Calzone of Pizza Hamburg is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println("Calzone of Pizza Hamburg is beeing package");
    }

}

class HamburgHawaii implements Pizza {

    @Override
    public void bake(){
        System.out.println("Hawaii of Pizza Hamburg is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Hawaii of Pizza Hamburg is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println("Hawaii of Pizza Hamburg is beeing packaged");
    }

}

class HamburgStagioni implements Pizza {

    @Override
    public void bake(){
        System.out.println( "Pizza Stagioni of Pizza Hamburg is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Pizza Stagioni of Pizza Hamburg is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println( "Pizza Stagioni of Pizza Hamburg is beeing packaged");
    }

}


class RostockSalami implements Pizza {

    @Override
    public void bake(){
        System.out.println("Salamipizza of Pizza Rostock is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println("Salamipizza of Pizza Rostock is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println("Salamipizza of Pizza Rostock is beeing packaged");
    }

}

class RostockCalzone implements Pizza {

    @Override
    public void bake(){
        System.out.println( "Calzone of Pizza Rostock is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Calzone of Pizza Rostock is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println("Calzone of Pizza Rostock is beeing package");
    }

}

class RostockHawaii implements Pizza {

    @Override
    public void bake(){
        System.out.println("Hawaii of Pizza Rostock is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Hawaii of Pizza Rostock is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println("Hawaii of Pizza Rostock is beeing packaged");
    }

}

class RostockStagioni implements Pizza {

    @Override
    public void bake(){
        System.out.println( "Pizza Stagioni of Pizza Rostock is beeing baked");
    }

    @Override
    public void cut(){
        System.out.println( "Pizza Stagioni of Pizza Rostock is beeing cut");
    }

    @Override
    public void pack(){
        System.out.println( "Pizza Stagioni of Pizza Rostock is beeing packaged");
    }

}