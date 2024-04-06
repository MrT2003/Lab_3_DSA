public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(5); // make new stack
        theStack.push(20); // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(90);
        // theStack.push(100);

        theStack.displayStackArray();
        // Method to display the stack
        theStack.displayStack();

        while (!theStack.isEmpty()) // until it's empty,
        { // delete item from stack
            long value = theStack.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println("");
    } // end main()

} // end class StackApp
