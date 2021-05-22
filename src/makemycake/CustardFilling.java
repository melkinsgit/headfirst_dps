package makemycake;

public class CustardFilling extends CakeDecorator {
    Cake cake;

    public CustardFilling (Cake cake) {
        this.cake = cake;
    };

    @Override
    public String getStatus () {
        return cake.getStatus() + " filled with custard";
    }

    @Override
    public Integer timeToComplete () {
        return cake.timeToComplete() + 1;
    }
}
