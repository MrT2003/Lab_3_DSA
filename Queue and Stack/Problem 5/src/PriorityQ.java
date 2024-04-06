public class PriorityQ {
   // array in sorted order, from max at 0 to min at size-1
   private int maxSize;
   private long[] queArray;
   private int nItems;

   // -------------------------------------------------------------
   public PriorityQ(int s) // constructor
   {
      maxSize = s;
      queArray = new long[maxSize];
      nItems = 0;
   }

   // -------------------------------------------------------------
   public void insert(long item) // insert item
   {
      int j;

      if (nItems == 0) // if no items,
         queArray[nItems++] = item; // insert at 0
      else // if items,
      {
         for (j = nItems - 1; j >= 0; j--) // start at end,
         {
            if (item > queArray[j]) // if new item larger,
               queArray[j + 1] = queArray[j]; // shift upward
            else // if smaller,
               break; // done shifting
         } // end for
         queArray[j + 1] = item; // insert it
         nItems++;
      } // end else (nItems > 0)
   } // end insert()
   // -------------------------------------------------------------

   public long remove() // remove minimum item
   {
      return queArray[--nItems];
   }

   // -------------------------------------------------------------
   public long peekMin() // peek at minimum item
   {
      return queArray[nItems - 1];
   }

   // -------------------------------------------------------------
   public boolean isEmpty() // true if queue is empty
   {
      return (nItems == 0);
   }

   // -------------------------------------------------------------
   public boolean isFull() // true if queue is full
   {
      return (nItems == maxSize);
   }
   // -------------------------------------------------------------
   // a method to display the queue 
   public void displayPQueue() {
      System.out.println("Priority Queue: ");
      System.out.print("[ ");
      for(int i = 0; i < maxSize; i++) {
         System.out.print(queArray[i] + " ");
         
      }
      System.out.println("]");
   }

   public void newInsert(long item) {
      if(isFull()) {
         System.out.println("Priority queue is full. Cannot insert element " +item);
      }
      queArray[nItems++] = item;
      sortQueue();
   }
   // -------------------------------------------------------------

   private void sortQueue() {
      for(int i = 0; i < nItems - 1; i++) {
         for(int j = 0; j < nItems - i - 1; j++) {
            if(queArray[j] < queArray[j + 1]) {
               long temp = queArray[j];
               queArray[j] = queArray[j + 1];
               queArray[j + 1] = temp;
            }
         }
      }
   }
} // end class PriorityQ
