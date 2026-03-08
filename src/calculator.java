import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java Calculator");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case'/':
                if (num2 == 0) {
                    System.out.println("ERROR: Division by zero is not allowed");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("ERROR: Operator not recognized");
                return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
