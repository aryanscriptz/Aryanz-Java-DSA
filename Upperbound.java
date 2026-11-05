import java.util.*;

public class Upperbound {
     public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        int target = 3;

        int left = 0;
        int right = arr.length - 1;
        int UpperBound = arr.length;

        
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] > target) {
                UpperBound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Upper bound index: " + UpperBound);
    }
    
}
