public class TryDivision{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two integers as command line arguments.");
            System.out.println("Usage: java DivisionExample <numerator> <denominator>");
            return;
    }
}

try{
    int nominator = Integer.parseInt(args[0]);
    int denominator = Integer.parseInt(args[1]);

    int result = nominator / denominator;

    System.out.println(nominator + " / " + denominator + "=" + result);
}

catch (ArithmeticException e){
    System.out.println("Error: Cant devide by zero!!!!!!!omggg ya lbghlll!");
}

catch (NumberFormatException e){
    System.out.println("Error: Enter a valid integer!!!!!");
}
}