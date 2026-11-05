import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        // Check lengths
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Sort arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare arrays
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println(result);

        sc.close();
    }
}

