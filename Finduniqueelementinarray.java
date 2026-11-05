public class Finduniqueelementinarray {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 3, 2, 1};
        int uniqueElement = findUniqueElement(arr);
        System.out.println("The unique element in the array is: " + uniqueElement);
    }

    public static int findUniqueElement(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; 
        }
        return unique;
    }

}
