package elkinsheadfirst.decorator.starbizz;

public class Mocha extends CondimentsDecorator {
    Beverage beverage; // an instance variable holds the beverage we are wrapping - that means we can wrap a coffee or a condiment!

    public Mocha(Beverage beverage) {
        this.beverage = beverage; // whatever we are wrapping will be passed
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with a shot of Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
