package stack;

import array.Array;

public class ArrayStack<E> implements Stack<E> {
  Array<E> array;

  public ArrayStack() {
    array = new Array<E>();
  }

  public ArrayStack(int capacity) {
    array = new Array<E>(capacity);
  }

  public int getSize() {
    return array.getSize();
  }

  public boolean isEmpty() {
    return array.isEmpty();
  }

  public E pop() {
    return array.removeLast();
  }

  public E peek() {
    return array.getLast();
  }

  public void push(E e) {
    array.addLast(e);
  }

  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("Stack : [");
    for (int i = 0; i < array.getSize(); i++) {
      res.append(array.get(i));
      if (i != array.getSize() - 1) {
        res.append(", ");
      }
    }
    res.append("] top");
    return res.toString();
  }
}
