public class Array {
  private int[] data;
  private int size;

  public Array(int capacity) {
    data = new int[capacity];
    size = 0;
  }

  public Array() {
    this(10);
  }

  int get(int index) {
    if (index < 0 || index > size) throw new IllegalArgumentException("数组越界");
    return data[index];
  }

  public int getSize() {
    return this.size;
  }

  public boolean contains(int e) {
    for (int i = 0; i < size; i++) if (e == data[i]) return true;
    return false;
  }

  public int find(int e) {
    for (int i = 0; i < size; i++) if (e == data[i]) return i;
    return -1;
  }

  public int getCapacity() {
    return data.length;
  }

  public void addFirst(int e) {
    add(0, e);
  }

  public void addLast(int e) {
    add(size, e);
  }

  public void add(int index, int e) {
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
