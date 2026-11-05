//You are given the head of a Singly Linked List and a value x, insert that value x at the beginning of the LinkedList and return the head of the modified Linked List.
import java.util.*;

class Linkedlistinsertionatbeginning {
                             
    public static LinkedList<Integer> insertionAtBeginning(LinkedList<Integer> list, int x) {
        list.addFirst(x);
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        int x = 0;
        LinkedList<Integer> modifiedList = insertionAtBeginning(list, x);

        System.out.println("Modified list after inserting " + x + " at the beginning: " + modifiedList);
    }
}
