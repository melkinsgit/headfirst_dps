package makemycake;

public class ChocolateCake extends Cake {
    public ChocolateCake () {
        status = " chocolate cake";
    }

    @Override
    public Integer timeToComplete () {
        return 2;
    }
}
