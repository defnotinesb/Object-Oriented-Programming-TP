import java.util.Scanner;
import java.util.InputMismatchException;


public class Project{
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){
        System.out.println("=" .repeat(50));
        System.out.println("  Welcome to the shape calculator");
        System.out.println("=" .repeat(50));

        int choice;

        do{
            displayMenu();

            choice = getIntInput("Enter you choice: ");

            switch (choice){
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
                    System.out.println("thank you for using my calculator!");
                    break;

                default: 
                    System.out.println("enter a number from 1 to 4");  
            }

            System.out.println();
        } while choice(!=4);
    }
    scanner.close();

    
}


    private static void displayMenu(){
        System.out.println("1. Calculate Circle Area and Perimeter");
        System.out.println("2. Calculate Rectangle Area and Perimeter");
        System.out.println("3. Calculate Triangle Area and Perimeter");
        System.out.println("4. Exit");
    }

    private static int getIntInput(String prompt){
        while(true){
            
        }
    }