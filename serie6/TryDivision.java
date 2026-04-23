import java.util.Scanner;
import java.util.InputMismatchException;

public class TryDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int nominator = scanner.nextInt();
            int denominator = scanner.nextInt();

            int result = nominator/denominator;

            System.out.println(nominator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cant devide by zero!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid integer!");
        }
        scanner.close();
    }
}