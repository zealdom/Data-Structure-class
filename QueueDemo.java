class Queue {

   int array[], capacity, behind, front;

   Queue(int c) {
      capacity = c;
      array = new int[capacity];
      front = 0;
      behind = 0;
   }

   boolean isEmpty() {
      return (front == behind);
   }
   boolean isFull() {
      return (behind == capacity);
   }
   
   void push(int value) {
      if(!isFull()) {
         array[behind] = value;
         behind++;
      }
   }
   int pop() {
      if (!isEmpty()) {
         return array[front++];
      } else {
         return array[behind];
      }
   }

   public String toString() {
      String tempStr = "";
      if(!isEmpty()) {
         tempStr = "Turn: " + (front + 1) + "\n";
      } else {
         tempStr = "Everyone is gone";
      }
      
      for (int i = front; i <= behind - 1; i++) {
         tempStr = tempStr + array[i] + "\n";
      }
      return tempStr;
   }
}

public class QueueDemo {

   public static void main (String [] args) {
      Queue myQueue = new Queue(5);
      int tempValue;
   
      myQueue.push(1);
      myQueue.push(2);
      myQueue.push(3);
      myQueue.push(50);
      myQueue.push(45);
   
      System.out.println(myQueue);
   
      while (!myQueue.isEmpty()) {
         tempValue = myQueue.pop();
         System.out.println(myQueue);
      }
   }
}
