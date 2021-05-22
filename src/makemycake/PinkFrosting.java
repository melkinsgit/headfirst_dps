package makemycake;

public class PinkFrosting extends CakeDecorator {
    Cake cake;

    public PinkFrosting (Cake cake) {
        this.cake = cake;
    }

    @Override
    public Integer timeToComplete() {
        return cake.timeToComplete() + 1;
    }

    @Override
    public String getStatus() {
        return cake.getStatus() + " frosted with pink frosting";
    }
}
