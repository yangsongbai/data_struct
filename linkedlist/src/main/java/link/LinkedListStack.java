package link;

import stack.Stack;

public class LinkedListStack<E> implements Stack<E> {

  private LinkedList<E> list;

  public LinkedListStack() {
    list = new LinkedList<>();
  }

  @Override
  public int getSize() {
    return list.getSize();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public E pop() {
    return list.removeFirst();
  }

  @Override
  public E peek() {
    return list.getFirst();
  }

  @Override
  public void push(E e) {
    list.addFirst(e);
  }

  public String toString() {
    StringBuilder ret = new StringBuilder();
    ret.append("Stack: top");
    ret.append(list);
    return ret.toString();
  }
}
