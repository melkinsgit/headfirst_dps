package elkinsheadfirst.decorator.starbizz;

public abstract class Beverage {
    String description = "Unknown Beverage"; // super description doesn't know what it is

    public String getDescription() {
        return description;
    }

    public abstract double cost(); // abstract - signature definition only
}
