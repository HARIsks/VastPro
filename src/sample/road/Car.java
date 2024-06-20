package sample.road;

import sample.auto.Vehicle;

public class Car extends Vehicle {
	    @Override
	    public void start() {
	        System.out.println("Car is starting with a key.");
	    }

	    @Override
	    public void start(String manual) {
	        System.out.println("Car is starting with " + manual + ".");
	    }
	    
	    @Override
	    public void stop() {
	        System.out.println("Car is stopping.");
	    }
}
