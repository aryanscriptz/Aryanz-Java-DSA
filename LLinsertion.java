import java.util.*;

class LLinsertion {

    public static LinkedList<Integer> insertion(int arr[]) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int num : arr) {
            list.add(num);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        LinkedList<Integer> list = insertion(arr);

        System.out.println(list);
    }
}