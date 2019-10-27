package loop.queue;

import queue.Queue;

public class Main {

  public static void main(String[] args) {
    Queue<Integer> queue = new LoopQueue(5);
    for (int i = 0; i < 10; i++) {
      queue.enqueue(i);
      System.out.println(queue);
    }
  }
}
