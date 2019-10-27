package doublelinked;

import queue.Queue;

public class LinkedListQueue<E> implements Queue<E> {
  private Node head, tail;

  private int size;

  public LinkedListQueue() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public void enqueue(E e) {
    if (tail == null) {
      tail = new Node(e);
      head = tail;
    } else {
      tail.next = new Node(e);
      tail = tail.next;
    }
    size++;
  }

  @Override
  public E dequeue() {
    if (isEmpty()) throw new IllegalArgumentException("");
    Node ret = head;
    head = head.next;
    ret.next = null;
    if (head == null) tail = null;
    size--;
    return ret.e;
  }

  @Override
  public E getFront() {
    if (isEmpty()) throw new IllegalArgumentException("");
    return head.e;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder();
    ret.append("LinkedListQueue : front [");
    Node cur = head;
    while (cur != null) {
      ret.append(cur.e + " - > ");
      cur = cur.next;
    }
    ret.append("NULL tail");
    return ret.toString();
  }

  private class Node {
    public E e;
    public Node next;

    public Node(E e, Node next) {
      this.e = e;
      this.next = next;
    }

    public Node(E e) {
      this(e, null);
    }

    public Node() {
      this(null, null);
    }

    @Override
    public String toString() {
      return e.toString();
    }
  }
}
