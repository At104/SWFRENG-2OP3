package circle;

public class Circle {
    // Initialize radius variable
    private double circleRadius;
    /**
     * Class constructor
     * @param radius The radius of the circle
     */
    public Circle(double radius) {
        //Assign circleRadius to the radius inputted by the user
        circleRadius = radius;
    }

    /**
     * Find area of a circle
     * @return The area of the circle (pi*radius^2)
     */
    public double findArea() {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    /**
     * Find circumference of a circle
     * @return The circumference of the circle (2*pi*radius)
     */
    public double findCircumference() {
        return 2 * Math.PI * circleRadius;
    }

}