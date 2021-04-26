package elkinsheadfirst.decorator.starbizz;

public class StarbizzCoffee {

    public static void main (String args[]) {
        Beverage espresso = new Espresso(); // start with a coffee type
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        /*
        * What starts as a DarkRoast gets wrapped in a mocha twice and then Whip - they are all beverages!!
        * */
        Beverage comboDrink = new DarkRoast(); // start with a coffee type
        comboDrink = new Mocha(comboDrink); // construct it into a condiment
        comboDrink = new Mocha(comboDrink); // construct that into another condiment
        comboDrink = new Whip(comboDrink);
        System.out.println(comboDrink.getDescription() + " $" + comboDrink.cost());


        Beverage soyCombo = new HouseBlend();
        soyCombo = new Soy(soyCombo);
        soyCombo = new Mocha(soyCombo);
        soyCombo = new Whip(soyCombo);
        System.out.println(soyCombo.getDescription() + " $" + soyCombo.cost());
    }
}
