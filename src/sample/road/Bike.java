package sample.road;

import sample.auto.Vehicle;

public class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick.");
    }

    @Override
    public void start(String manual) {
        System.out.println("Bike is starting with " + manual + ".");
    }
    
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}
