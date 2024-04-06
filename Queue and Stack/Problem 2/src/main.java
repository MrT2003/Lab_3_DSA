import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expression = scanner.nextLine();

        try {
            int result = cal.evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}