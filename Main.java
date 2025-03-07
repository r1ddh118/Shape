//Riddhi Poddar
//23070126105
//B3(2023-27)
//Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Shape Calculator Menu ===");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {
                case 1: // Rectangle
                    System.out.print("Enter length of rectangle in cm: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width of rectangle in cm: ");
                    double width = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area: " + rectangle.getArea() + " square cm");
                    System.out.println("Perimeter: " + rectangle.getPerimeter() + " cm");
                    break;

                case 2: // Circle
                    System.out.print("Enter radius of circle in cm: ");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.getArea() + " square cm");
                    System.out.println("Perimeter (Circumference): " + circle.getPerimeter() + " cm");
                    break;

                case 3: // Square
                    System.out.print("Enter length of square in cm: ");
                    double side = scan.nextDouble();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.getArea() + " square cm");
                    System.out.println("Perimeter: " + square.getPerimeter() + " cm");
                    break;

                case 4: // Sphere
                    System.out.print("Enter radius of sphere in cm: ");
                    radius = scan.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    System.out.println("Surface Area: " + sphere.getArea() + " square cm");
                    System.out.println("Volume: " + sphere.getVolume() + " cubic cm");
                    break;

                case 5: // Cylinder
                    System.out.print("Enter radius of cylinder in cm: ");
                    radius = scan.nextDouble();
                    System.out.print("Enter height of cylinder in cm: ");
                    double height = scan.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Surface Area: " + cylinder.getArea() + " square cm");
                    System.out.println("Volume: " + cylinder.getVolume() + " cubic cm");
                    break;

                case 6: // Pyramid
                    System.out.print("Enter base length of pyramid in cm: ");
                    double baseLength = scan.nextDouble();
                    System.out.print("Enter height of pyramid in cm: ");
                    height = scan.nextDouble();
                    System.out.print("Enter slant height of pyramid in cm: ");
                    double slantHeight = scan.nextDouble();
                    Pyramid pyramid = new Pyramid(baseLength, height, slantHeight);
                    System.out.println("Surface Area: " + pyramid.getArea() + " square cm");
                    System.out.println("Volume: " + pyramid.getVolume() + " cubic cm");
                    break;

                case 7: // Exit
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 7);
    }
}
