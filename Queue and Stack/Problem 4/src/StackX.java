public class StackX {
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack
    // --------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }

    // --------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + j);
        }
        stackArray[++top] = j; // increment top, insert item
    }

    // --------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }

    // --------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return a default value indicating failure if stack is empty
        }
        return stackArray[top];
    }

    // --------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }

    // --------------------------------------------------------------
    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }

    public void displayStackArray() {
        System.out.print("Stack Array: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    // --------------------------------------------------------------
    public void displayStack() {
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
} // end class StackX
