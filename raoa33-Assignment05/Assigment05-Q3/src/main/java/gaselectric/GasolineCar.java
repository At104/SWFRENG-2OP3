package gaselectric;

public class GasolineCar extends Car implements Refueling {
    private double fuelTankCapacity;
    private double milesPerGallon;

    public GasolineCar(String make, String model, double fuelTankCapacity, double milesPerGallon) {
        super(make, model);
        this.fuelTankCapacity = fuelTankCapacity;
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesPerGallon;
        
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public double calculateRange() {
        return fuelTankCapacity * calculateFuelEfficiency();
    }
   
    @Override
    public void refuel(double amount) {
        fuelTankCapacity += amount;
    }
    
}
