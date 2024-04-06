import java.util.Stack;

public class Calculation {
    public int evaluateExpression(String expression) {
        //create 2 stack for operand and operator
        Stack <Integer> operandStack = new Stack<>();
        Stack <Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char token = expression.charAt(i);

            if (token == ' ') {
                continue; // Skip whitespaces
            }

            if (Character.isDigit(token)) {
                StringBuilder sb = new StringBuilder();
                sb.append(token);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    sb.append(expression.charAt(++i));
                }
                operandStack.push(Integer.parseInt(sb.toString()));
            } else if (token == '(') {
                operatorStack.push(token);
            } else if (token == ')') {
                while (operatorStack.peek() != '(') {
                    processOperation(operandStack, operatorStack);
                }
                operatorStack.pop(); // Pop '('
            } else if (isOperator(token)) {                         /*if it is operator */
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(token)) {
                    processOperation(operandStack, operatorStack);
                }
                operatorStack.push(token);
            } else {
                throw new IllegalArgumentException("Invalid character: " + token);
            }
        }

        while (!operatorStack.isEmpty()) processOperation(operandStack, operatorStack);

        return operandStack.pop();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private static void processOperation(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop(); //Remove the operator
        int operand2 = operandStack.pop(); // Remove first operand
        int operand1 = operandStack.pop(); // Remove second operand
        int result = performOperation(operand1, operand2, operator); // Performing calculation after prompting user inputting valid operator
        operandStack.push(result); // Get result and add it the stack again
    }

    // Prompt user to input valid operator
    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
