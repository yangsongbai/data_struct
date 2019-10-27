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

  E get(int index) {
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
    if (size == data.length) throw new IllegalArgumentException("添加失败，数组已满");
    if (index < 0 || index > size) {
      throw new IllegalArgumentException("越界");
    }
    for (int i = size - 1; i > index; i--) {
      data[i + 1] = data[i];
    }
    data[index] = e;
    size++;
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
