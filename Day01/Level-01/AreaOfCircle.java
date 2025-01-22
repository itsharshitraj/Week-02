import java.util.*;
public class AreaofCircle{
	// Main method to test the Circle class
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
		
        Circle circle = new Circle(radius);
        circle.display();
		
		
	}
	
}


class Circle {
    double radius;
	
    // Constructor to initialize the Circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
	}
	
    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
	}
	
    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
	}
	
    // Method to display the radius, area, and circumference of the circle
    public void display() {
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
	}
	
	
}
