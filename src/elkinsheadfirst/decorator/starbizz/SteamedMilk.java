package elkinsheadfirst.decorator.starbizz;

public class SteamedMilk extends Beverage {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with steamed milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
