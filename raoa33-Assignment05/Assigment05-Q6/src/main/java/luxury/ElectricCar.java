package luxury;

public class ElectricCar extends Car implements Refueling {
    private float batteryCapacity;
    private float milesPerKWh;


    public ElectricCar(String make, String model, float batteryCapacity, float milesPerKWh) {
        super(make, model);
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWh = milesPerKWh;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    public void setMilesPerKWh(float milesPerKWh) {
        this.milesPerKWh = milesPerKWh;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesPerKWh;
    }

    @Override
    public double calculateRange() {
        return (batteryCapacity * milesPerKWh);
    }

    @Override
    public void refuel(double amount) {
        batteryCapacity += amount;
    }
}