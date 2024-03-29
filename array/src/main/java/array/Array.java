package array;

public class Array<E> {
  private E[] data;
  private int size;

  public Array(int capacity) {
    data = (E[]) new Object[capacity];
    size = 0;
  }

  public Array() {
    this(10);
  }

  public boolean isEmpty() {
    if (size == 0) return true;
    return false;
  }

  public E getFirst() {
    return get(0);
  }

  public E getLast() {
    return get(size - 1);
  }

  public E get(int index) {
    if (index < 0 || index > size) throw new IllegalArgumentException("数组越界");
    return data[index];
  }

  public int getSize() {
    return this.size;
  }

  public boolean contains(E e) {
    for (int i = 0; i < size; i++) if (data[i].equals(e)) return true;
    return false;
  }

  public void set(int index, E e) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("越界");
    }
    data[index] = e;
  }

  public int find(E e) {
    for (int i = 0; i < size; i++) if (data[i].equals(e)) return i;
    return -1;
  }

  public int getCapacity() {
    return data.length;
  }

  public void addFirst(E e) {
    add(0, e);
  }

  public void addLast(E e) {
    add(size, e);
  }

  public E remove(int index) {
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("越界");
    }
    if (size == data.length / 4 && data.length / 2 != 0) {
      resize(data.length / 2);
    }
    E ret = data[index];
    for (int i = index + 1; i < size; i++) {
      data[i - 1] = data[i];
    }
    size--;
    data[size] = null;
    return ret;
  }

  public E removeFirst() {
    return remove(0);
  }

  public E removeLast() {
    return remove(size - 1);
  }

  public void removeElement(E e) {
    int index = find(e);
    if (index != -1) remove(index);
  }

  public void add(int index, E e) {

    if (index < 0 || index > size) {
      throw new IllegalArgumentException("越界");
    }
    if (size == data.length) resize(2 * data.length);
    for (int i = size - 1; i > index; i--) {
      data[i + 1] = data[i];
    }
    data[index] = e;
    size++;
  }

  private void resize(int newCapacity) {
    E[] newData = (E[]) new Object[newCapacity];
    for (int i = 0; i < size; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  @Override
  public String toString() {
    /*  return "Array{" +
    "data=" + Arrays.toString(data) +
    ", size=" + size +
    '}';*/
    StringBuilder res = new StringBuilder();
    res.append(String.format("Arrays size = %d ,capacity = %d \n[", size, data.length));
    for (int i = 0; i < size; i++) {
      res.append(data[i]);
      if (i != size - 1) {
        res.append(", ");
      }
    }
    res.append(']');
    return res.toString();
  }
}
