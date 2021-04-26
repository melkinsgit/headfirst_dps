package elkinsheadfirst.decorator.starbizz;

public class Whip extends Beverage {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", topped with whip cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
