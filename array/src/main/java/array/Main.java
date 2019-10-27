package array;

public class Main {
  public static void main(String[] args) {
    Array<Integer> array = new Array<>();
    for (int i = 0; i < 10; i++) array.addLast(i);
    System.out.println(array);
    array.addLast(2);
    System.out.println(array);

    Array<Student> stu = new Array<>(20);
    for (int i = 0; i < 10; i++) stu.addLast(new Student("ss" + i, i));
    System.out.println(stu);
  }
}
