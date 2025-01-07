package dispatch;

/**
 * Abstract class representing the blueprint for a car
 * Atul Rao, 2024, 2OP3 Assignment 5
 */
public abstract class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void updateMake(String make) {
        this.make = make;
    }

    public void updateModel(String model) {
        this.model = model;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateFuelEfficiency(); 
    public abstract double calculateRange(); 
}