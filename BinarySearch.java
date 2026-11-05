import java.util.*;

public class BinarySearch {
    public static void main(String [] args) { 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }   

        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found) {
            System.out.println("ELEMENT FOUND IN THE ARRAY");
        } else {
            System.out.println("ELEMENT NOT FOUND IN THE ARRAY");
        }

        sc.close();
    }
}
