package link;

/**
 * addLast(e) O(n)
 *
 * @param <E>
 */
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

  public E remove(int index) {
    if (index < 0 || index > size) throw new IllegalArgumentException("");
    Node prev = dummyHead;
    for (int i = 0; i < index - 1; i++) {
      prev = prev.next;
    }
    Node retNode = prev.next;
    prev.next = retNode.next;
    retNode.next = null;
    size--;
    return retNode.e;
  }

  public E removeFirst() {
    return remove(0);
  }

  public E removeLast() {
    return remove(size);
  }

  public void add(int index, E e) {
    if (index < 0 || index > size) throw new IllegalArgumentException("");
    Node pre = dummyHead;
    for (int i = 0; i < index; i++) {
      pre = pre.next;
    }
    pre.next = new Node(e, pre.next);
    size++;
  }

  public E get(int index) {
    if (index < 0 || index > size) throw new IllegalArgumentException("");
    Node cur = dummyHead.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    return cur.e;
  }

  public void set(int index, E e) {
    if (index < 0 || index > size) throw new IllegalArgumentException("");
    Node cur = dummyHead.next;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    cur.e = e;
  }

  public E getFirst() {
    return get(0);
  }

  public boolean contains(E e) {
    Node cur = dummyHead.next;
    while (cur != null) {
      if (cur.e.equals(e)) return true;
    }
    return false;
  }

  public E getLast() {
    return get(size);
  }

  public void addLast(E e) {
    add(size, e);
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
      stringBuilder.append(cur.e).append(" -> ");
    }
    stringBuilder.append("NULL");
    return stringBuilder.toString();
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
