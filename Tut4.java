import java.util.*;

 class Tut4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if ((n & 1) == 1) {
            System.out.println(n + " is odd.");
        } else {
            System.out.println(n + " is even.");
        }

        sc.close();

    }
}
