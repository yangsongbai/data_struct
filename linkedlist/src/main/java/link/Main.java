package link;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> l = new LinkedList();
    for (int i = 0; i < 10; i++) {
      l.addLast(i);
      System.out.println(l);
    }
    System.out.println(l);
  }
}
