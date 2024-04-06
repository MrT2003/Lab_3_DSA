import java.util.*;


class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);
        // thePQ.insert(30);
        // thePQ.insert(50);
        // thePQ.insert(10);
        // thePQ.insert(40);
        // thePQ.insert(20);
        thePQ.newInsert(30);
        thePQ.newInsert(50);
        thePQ.newInsert(10);
        thePQ.newInsert(40);
        thePQ.newInsert(20);


        thePQ.displayPQueue();

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        } // end while
        System.out.println("");
        
        System.out.println("Using a priority queue");
        // Queue<Long> queue = new PriorityQueue<>();
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(30);
        queue.offer(10);
        queue.offer(50);
        queue.offer(40);
        queue.offer(20);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll());
            System.out.print(" ");
        }




    } // end main()
    // -------------------------------------------------------------
} // end class PriorityQApp