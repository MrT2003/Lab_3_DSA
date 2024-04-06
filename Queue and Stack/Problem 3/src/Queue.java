public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // --------------------------------------------------------------
    public void insert(long j) {
        if (rear == maxSize - 1) // deal with wraparound
            rear = -1;
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }

    // --------------------------------------------------------------
    // take item from front of queue
    public long remove() {
        long temp = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
            front = 0;
        nItems--; // one less item
        return temp;
    }

    // --------------------------------------------------------------
    // peek at front of queue
    public long peekFront() {
        return queArray[front];
    }

    // --------------------------------------------------------------
    // true if queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // --------------------------------------------------------------
    // true if queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // --------------------------------------------------------------
    // number of items in queue
    public int size() {
        return nItems;
    }

    public void displayQueue() {                    /*Câu 1 */
        System.out.println("Queue: ");
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int i = front; i <= maxSize - 1; i++) {
                System.out.println(queArray[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(queArray[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Front index: " + front);
        System.out.println("Rear index: " + rear);
    }
    public void displayFrontRear() {
        int rearIndex = rear == -1 ? maxSize - 1 : rear;
        
        System.out.println("\nFront index: " + front + "; Value at queArray[front]: " + queArray[front]);
        System.out.println("\nRear index: " + rearIndex + "; Value at queArray[rear index]: " + queArray[rearIndex]);
    }
    
}
