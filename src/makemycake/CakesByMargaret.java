package makemycake;

public class CakesByMargaret {

    public static void main (String args[]) {
        Cake chocolatePinkFrostedCustardFilledFilledCake = new ChocolateCake();
        System.out.println("Welcome to Cakes By Margaret and thanks for starting your order for a" + chocolatePinkFrostedCustardFilledFilledCake.getStatus());

        chocolatePinkFrostedCustardFilledFilledCake = new CustardFilling(chocolatePinkFrostedCustardFilledFilledCake);
        chocolatePinkFrostedCustardFilledFilledCake = new PinkFrosting(chocolatePinkFrostedCustardFilledFilledCake);

        System.out.println("You have ordered a" + chocolatePinkFrostedCustardFilledFilledCake.getStatus());

        Integer timeToComplete = chocolatePinkFrostedCustardFilledFilledCake.timeToComplete();
        if (timeToComplete > 3) {
            System.out.println("Sorry, you only have 3 hours and it is going to take " + timeToComplete + " hours to finish your" + chocolatePinkFrostedCustardFilledFilledCake.getStatus());
        }
    }
}
