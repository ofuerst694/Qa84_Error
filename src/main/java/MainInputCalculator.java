import java.util.Scanner;

public class MainInputCalculator {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);// wwod s kancole
        System.out.print("Enter first number >>>");
        double first = scan.nextDouble();
        System.out.print("Enter second number >>>");
        double second = scan.nextDouble();
        System.out.print("Enter action(+,-,*,/) >>>");
        String action = scan.next();
        double res = calculator(first, second, action);
        System.out.println("Your result = " + res);
        scan.close();// zawerschaet programmu
    }
    public static double calculator(double a,
                                    double b,
                                    String action) {
        double res = 0;
        switch (action) {
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
            case "/": res = a / b; break;
            default:
                System.out.println("wrong action");
        }
        return res;
    }
}
