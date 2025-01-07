package dispatch;
import java.util.ArrayList;
/**
 * Implments the main method to test the dispatching of the cars using lists
 */
public class App {


    public static double calculateTotalRange(ArrayList<Car> cars) {
        double totalRange = 0;
        for (Car car : cars) {
            totalRange += car.calculateRange();
        }
        return totalRange;
    }
    public static void main(String[] args) {
        ArrayList <Car> cars = new ArrayList<Car>();

        for (int i = 1; i <= 5; i++) {
            cars.add(new ElectricCar("Electric Car", "Model " + i, 150 + 2*i, 50 + 2*i ));
            cars.add(new GasolineCar("Gas Car", "Model " + i, 200+2*i, 60 + 2*i));
        }

        for (Car car : cars) {
            System.out.printf("Make: %s, Model: %s, Range: %.2f, Efficiency: %.2f\n", car.getMake(), car.getModel(), car.calculateRange(), car.calculateFuelEfficiency());
        }

        System.out.printf("Total Range: %.2f\n", calculateTotalRange(cars));
    }
}
