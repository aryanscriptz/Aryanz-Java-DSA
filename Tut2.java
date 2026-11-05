import java.util.*;

public class Tut2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 18) {
            System.out.println("YES");
        } else if (number < 20) {
            System.out.println("NO");
        } else {
            System.out.println("C");
        }

        sc.close();
    }
}