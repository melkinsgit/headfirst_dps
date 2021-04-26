package elkinsheadfirst.decorator.starbizz;

public abstract class CondimentsDecorator extends Beverage {
    public abstract String getDescription(); // each instance of condiment will have to implement this method; super will be insufficient for a condiment
    // instances of CondimentsDecorate will also have to implement cost() per super
}
