package makemycake;

public abstract class Cake {
    String status = "unknown cake";

    public String getStatus () {
        return status;
    }

    public abstract Integer timeToComplete ();
}
