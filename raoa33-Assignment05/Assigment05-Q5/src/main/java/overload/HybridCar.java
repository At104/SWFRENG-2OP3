package overload;

public class HybridCar extends Car {
    private double fuelTankCapacity;
    private double batteryCapacity;
    private double milesPerGallon;
    private double milesPerKWh;

    // Both fuel tank and battery capacity
    public HybridCar(String make, String model, double fuelTankCapacity, double batteryCapacity, double milesPerGallon, double milesPerKWh) {
        super(make, model);
        this.fuelTankCapacity = fuelTankCapacity;
        this.batteryCapacity = batteryCapacity;
        this.milesPerGallon = milesPerGallon;
        this.milesPerKWh = milesPerKWh;
    }

    // Either one of fuel tank or battery capacity
    public HybridCar(String make, String model, double tankCapacity, double milesPerFuel, boolean isBattery) {
        super(make, model);
        if (isBattery) {
            this.batteryCapacity = tankCapacity;
            this.milesPerKWh = milesPerFuel ;
        }
        else {
            this.fuelTankCapacity = tankCapacity;
            this.milesPerGallon = milesPerFuel;
        }
    }


    // Getters and setters
    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getMilesPerKWh() {
        return milesPerKWh;
    }

    public void setMilesPerKWh(double milesPerKWh) {
        this.milesPerKWh = milesPerKWh;
    }

    @Override
    public double calculateRange() {
        // Assuming some logic to calculate range for hybrid cars
        return (fuelTankCapacity * milesPerGallon) + (batteryCapacity * milesPerKWh);
    }

    @Override
    public double calculateFuelEfficiency() {
        return (milesPerGallon + milesPerKWh) / 2;
    }
}