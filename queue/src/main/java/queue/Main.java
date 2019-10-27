package queue;

public class Main {
  public static void main(String[] args) {
    ArrayQueue arrayQueue = new ArrayQueue();
    for (int i = 0; i < 10; i++) {
      arrayQueue.enqueue(i);
      if (i > 1 && (i % 2 == 0)) {
        System.out.println(arrayQueue.dequeue());
      }
      System.out.println(arrayQueue);
    }
  }
}
