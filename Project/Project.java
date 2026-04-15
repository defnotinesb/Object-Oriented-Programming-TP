import java.util.Scanner;
import java.util.InputMismatchException;

public class Project {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("=".repeat(50));
        System.out.println("  Welcome to the shape calculator");
        System.out.println("=".repeat(50));

        int choice;

        do {
            displayMenu();
            choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    calculateCircle();
                    break;
                case 2:
                    calculateRectangle();
                    break;
                case 3:
                    calculateTriangle();
                    break;
                case 4:
                    System.out.println("Thank you for using my calculator!");
                    break;
                default:
                    System.out.println("Enter a number from 1 to 4");
            }
            System.out.println();
        } while (choice != 4);  

        scanner.close();
    }


    private static void displayMenu() {
        System.out.println("\n--- SHAPE CALCULATOR ---");
        System.out.println("1. Calculate Circle Area and Perimeter");
        System.out.println("2. Calculate Rectangle Area and Perimeter");
        System.out.println("3. Calculate Triangle Area and Perimeter");
        System.out.println("4. Exit");
    }


    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt(); 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Value must be positive. Please try again.");
                    continue;
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        }
    }

    private static boolean askToDraw(String shapeName) {
        while (true) {
            System.out.print("Do you want to draw the shape? (yes/no): ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals("yes")) {
                return true;
            } else if (answer.equals("no")) {
                return false;
            } else {
                System.out.println("Please enter 'yes' or 'no'.");
            }
        }
    }


    private static void calculateCircle() {

        double radius = getDoubleInput("Enter the radius of the circle: ");

        Shape circle = new Circle(radius);

        System.out.printf("Area of the circle: %.2f%n", circle.area());
        System.out.printf("Perimeter of the circle: %.2f%n", circle.primeter());

        if (askToDraw("circle")) {
            ((Drawable) circle).draw();
        }
    }

    private static void calculateRectangle() {
        double length = getDoubleInput("Enter the length of the rectangle: ");
        double width = getDoubleInput("Enter the width of the rectangle: ");

        Shape rectangle = new Rectangle(length, width);

        System.out.printf("Area of the rectangle: %.2f%n", rectangle.area());
        System.out.printf("Perimeter of the rectangle: %.2f%n", rectangle.primeter());

        if (askToDraw("rectangle")) {
            ((Drawable) rectangle).draw();
        }
    }

    private static void calculateTriangle() {
        double base = getDoubleInput("Enter the base of the triangle: ");
        double height = getDoubleInput("Enter the height of the triangle: ");
        double side1 = getDoubleInput("Enter the first side of the triangle: ");
        double side2 = getDoubleInput("Enter the second side of the triangle: ");
        double side3 = getDoubleInput("Enter the third side of the triangle: ");

        Shape triangle = new Triangle(side1, side2, side3, base, height);

        System.out.printf("Area of the triangle: %.2f%n", triangle.area());
        System.out.printf("Perimeter of the triangle: %.2f%n", triangle.primeter());

        if (askToDraw("triangle")) {
            ((Drawable) triangle).draw();
        }
    }  
}
