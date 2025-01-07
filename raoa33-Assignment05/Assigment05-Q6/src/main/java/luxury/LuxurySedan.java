package luxury;

public class LuxurySedan extends LuxuryCar {
    private String destination;

    public LuxurySedan(String make, String model, float batteryCapacity, float milesPerKWh, double airPressure, boolean premiumSoundSystem, String destination) {
        super(make, model, batteryCapacity, milesPerKWh, airPressure, premiumSoundSystem);
        this.destination = destination;
    }

    @Override
    public void setGPSDestination(String destination) {
        this.destination = destination;
    }

    public String getGPSDestination() {
        return destination;
    }

   
}