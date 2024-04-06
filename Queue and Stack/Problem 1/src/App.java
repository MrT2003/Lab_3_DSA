import java.util.Scanner;
import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimal = scanner.nextInt();

        Method method = new Method(decimal);
        int octal = method.convertDecimalToOctal();
        System.out.println("Convert from " +decimal+ " to " +octal);


        Stack<Integer> stack_1 = new Stack<>();
        stack_1.push(1);
        stack_1.push(2);
        stack_1.push(3);

        Stack<Integer> stack_2 = new Stack<>();
        stack_2.push(4);
        stack_2.push(5);
        stack_2.push(6);
        Stack<Integer> result_2 = method.concatenateStacks(stack_1, stack_2);
        System.out.println(result_2);

        System.out.println("-------------------------------");
        Stack<Integer> stack_3 = new Stack<>();
        stack_3.push(1);
        stack_3.push(2);
        stack_3.push(3);
        boolean result_3 = method.stacksIdentical(stack_1, stack_2);
        System.out.println(result_3);
    }

}
