package elkinsheadfirst.decorator.starbizz;

public class HouseBlend extends Beverage {
    // inherited from super String deacription

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
