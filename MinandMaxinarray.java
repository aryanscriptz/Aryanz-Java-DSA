public class MinandMaxinarray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int min = arr[0]; 
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element in the array is: " + min);
        System.out.println("Maximum element in the array is: " + max);
    }
    
}
