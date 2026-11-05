import java.util.*;

public class Tut3 {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");

        int A = sc.nextInt();

        System.out.print("Enter another age: ");
        int B = sc.nextInt();

        if (A > B) {
            System.out.println("A");
        } else if (B < A) {
            System.out.println("B");
        } else {
            System.out.println("AB");
        }

        sc.close();
    }
}
