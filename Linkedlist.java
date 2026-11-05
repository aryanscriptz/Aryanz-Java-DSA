import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " + list);

        list.set(2, 10);
        System.out.println("Updated list: " + list);
          }

        }