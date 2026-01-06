package Constructors;

public class Circle {

	double radius;

    // Constructor to initialize radius
    Circle(double r) {
        radius = r;   
    }

    // Method to calculate area
    double calculateArea() {
       return  3.14 * radius * radius;  
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of circle : "+ c.calculateArea());
    }
}
