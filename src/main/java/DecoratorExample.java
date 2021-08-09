import decorator.Decorator;
import model.Scooter;
import model.impl.ScooterImpl;

public class DecoratorExample {
    public static void main(String[] args) {

        Scooter scooter = new Decorator(new ScooterImpl("Tiger", 1990));
        scooter.status();

    }
}
