package link;

public class LinkedList<E> {
  private Node head;
  private int size;

  public LinkedList() {
    head = null;
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
    head = new Node(e, head);
    size++;
  }

  public void add(int index, E e) {
    if (index < 0 || index > size) throw new IllegalArgumentException("");
    if (index == 0) addFirst(e);
    else {
      Node pre = head;
      for (int i = 0; i < index - 1; i++) {
        pre = pre.next;
        pre.next = new Node(e, pre.next);
        size++;
      }
    }
    head = new Node(e, head);
    size++;
  }

  public void addLast(E e) {
    head = new Node(e, head);
    size++;
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
