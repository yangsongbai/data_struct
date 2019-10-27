package queue;

public interface Queue<E> {
  public void enqueue(E e);

  public E dequeue();

  E getFront();

  int getSize();

  boolean isEmpty();
}
