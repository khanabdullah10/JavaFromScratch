package src.springBoot.ioc.dependecyInjection;

public class viaConstructor {

    Example ex;
    // Constructor injector
    public viaConstructor(Example ex){
        this.ex = ex;
    }

}

class Example{

}
