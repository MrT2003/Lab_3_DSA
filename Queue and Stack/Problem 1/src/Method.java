import java.util.Stack;

public class Method {
    int decimal_Number;

    public Method(int decimal_Number) {
        this.decimal_Number = decimal_Number;
    }

    public int convertDecimalToOctal() {
        int octalNumber = 0;
        int position = 1;
        Stack<Integer> stack = new Stack<>();

        if (decimal_Number == 0) {
            return 0;
        }
        while (decimal_Number != 0) {
            int reminder = decimal_Number % 8;
            stack.push(reminder);
            decimal_Number /= 8;
        }
        Stack<Integer> stack_2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack_2.push(stack.pop());
        }
        while (!stack_2.isEmpty()) {
            octalNumber += stack_2.pop() * position;
            position *= 10;
        }
        return octalNumber;
    }

    public Stack<Integer> concatenateStacks(Stack<Integer> stack_1, Stack<Integer> stack_2) {
        Stack<Integer> resultStack = new Stack<>();

        Stack<Integer> tempStack1 = new Stack<>();
        tempStack1.addAll(stack_1);

        Stack<Integer> tempStack2 = new Stack<>();
        tempStack2.addAll(stack_2);

        while (!tempStack1.isEmpty()) {
            resultStack.push(tempStack1.pop());
        }
        while (!tempStack2.isEmpty()) {
            resultStack.push(tempStack2.pop());
        }

        return resultStack;
    }

    public boolean stacksIdentical(Stack<Integer> stack_1, Stack<Integer> stack_2) {
        if(stack_1.size() != stack_2.size()) {
            return false;
        }
        while (!stack_1.isEmpty()) {
            if(!stack_1.pop().equals(stack_2.pop())) {
                return false;
            }
        }
        return true;


    }
}
