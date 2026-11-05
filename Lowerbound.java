import java.util.*;

public class Lowerbound {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;
        int lowerBound = arr.length; 

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= target) {
                lowerBound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("Lower bound index: " + lowerBound);
    }
}