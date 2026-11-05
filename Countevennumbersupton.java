import java.util.Scanner;

public class Countevennumbersupton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("The count of even numbers from 1 to " + n + " is: " + count);
    }
    
}
