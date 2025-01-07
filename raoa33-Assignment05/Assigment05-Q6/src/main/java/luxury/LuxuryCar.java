package luxury;

public abstract class LuxuryCar extends ElectricCar {
    private double airPressure;
    private boolean premiumSoundSystem;

    public LuxuryCar(String make, String model, float batteryCapacity, float milesPerKWh, double airPressure, boolean premiumSoundSystem) {
        super(make, model, batteryCapacity, milesPerKWh);
        this.airPressure = airPressure;
        this.premiumSoundSystem = premiumSoundSystem;
    }

    // Getters and setters
    public double checkAirPressure() {
        return airPressure;
    }

    public void setAirPressure(double airPressure) {
        this.airPressure = airPressure;
    }

    public boolean hasPremiumSoundSystem() {
        return premiumSoundSystem;
    }

    public void setPremiumSoundSystem(boolean premiumSoundSystem) {
        this.premiumSoundSystem = premiumSoundSystem;
    }


    public abstract void setGPSDestination(String destination);
}