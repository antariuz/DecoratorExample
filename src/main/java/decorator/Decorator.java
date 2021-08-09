package decorator;

import model.Scooter;

public class Decorator implements Scooter {

    Scooter scooter;

    public Decorator(Scooter scooter) {
        this.scooter = scooter;
    }

    @Override
    public void status() {
        System.out.println("Checking database...");
        scooter.status();
    }
}
