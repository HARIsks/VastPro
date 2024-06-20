package sample.road;

import sample.auto.Vehicle;

public class Bus extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bus is starting with a button.");
    }

    @Override
    public void start(String manual) {
        System.out.println("Bus is starting with " + manual + ".");
    }
    
    @Override
    public void stop() {
        System.out.println("Bus is stopping.");
    }
}
