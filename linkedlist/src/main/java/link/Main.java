package link;

public class Main {
  public static void main(String[] args) {
    /*  LinkedList<Integer> l = new LinkedList();*/
    LinkedListStack<Integer> l = new LinkedListStack();
    for (int i = 0; i < 10; i++) {
      l.push(i);
      System.out.println(l);
    }
    System.out.println(l);
  }
}
