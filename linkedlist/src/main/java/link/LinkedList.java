package link;

public class LinkedList<E> {
  private Node dummyHead;
  private int size;

  public LinkedList() {
    dummyHead = new Node(null, null);
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void addFirst(E e) {
    /*  Node node = new Node(e);
    node.next = head;
    head = node;*/
    add(0, e);
  }

  public void add(int index, E e) {
    if (index < 0 || index > size) throw new IllegalArgumentException("");
    Node pre = dummyHead;
    for (int i = 0; i < index; i++) {
      pre = pre.next;
      pre.next = new Node(e, pre.next);
      size++;
    }
  }

  public void addLast(E e) {
    add(size, e);
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
