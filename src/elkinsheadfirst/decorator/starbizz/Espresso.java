package elkinsheadfirst.decorator.starbizz;

public class Espresso extends Beverage {
    // inherited from super String deacription

    public Espresso () {
        description = "Espresso"; // don't need parameter because this can be hard entered
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
