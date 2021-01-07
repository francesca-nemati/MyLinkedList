import java.util.*;
public class MyTester {

  public static void main(String[] args) {
    MyLinkedList first = new MyLinkedList();
    first.add("hi");
    first.add("does");
    first.add("this");
    first.add("work?");
    first.add(0,"hello");
    first.add(5,"maybe");
    first.set(5, "yes");
    first.set(0, "whazzzup");
    first.set(4, "function?");
    first.remove(0);
    first.remove(4);

    MyLinkedList m = new MyLinkedList();
    m.add("hello");
    m.add("world");
    m.add("foo");
    m.add("bar");
    m.set(3, "far");
    m.remove(2);
    //System.out.println(m.get(4));
    System.out.println(first.toString());
    System.out.println(first.toStringReversed());
    System.out.println(first.size());
    System.out.println(m.toString());
    System.out.println(m.toStringReversed());
    System.out.println(m.size());

    first.extend(m);
    System.out.println(first.toString());
    System.out.println(first.size());
    System.out.println(m.toString());
    System.out.println(m.size());
  }

}
