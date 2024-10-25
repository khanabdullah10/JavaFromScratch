package src.springBoot.ioc.dependecyInjection;

public class viaSetter {

    ExampleOne one ;

    // setter injector
    public void setter(ExampleOne onee){
        this.one = onee;
    }

}
class ExampleOne {



}
