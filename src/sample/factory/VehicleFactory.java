package sample.factory;

import sample.auto.Vehicle;
import sample.road.Car;
import sample.road.Bus;
import sample.road.Bike;

public class VehicleFactory {
    public static void main(String[] args) {
        Vehicle vehicle;
        String manual = "manual start";

        vehicle = new Car();
        vehicle.start();
        vehicle.start(manual);
        vehicle.stop(); 

        vehicle = new Bus();
        vehicle.start();
        vehicle.start(manual);
        vehicle.stop();

        vehicle = new Bike();
        vehicle.start();
        vehicle.start(manual);
        vehicle.stop();
    }
}
