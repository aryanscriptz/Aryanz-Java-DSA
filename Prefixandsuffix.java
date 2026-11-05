import java.util.*;
public class Prefixandsuffix {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        boolean isPrefix = T.startsWith(S);
        boolean isSuffix = T.endsWith(S);

        if (isPrefix && isSuffix) {
            System.out.println(0);
        } else if (isPrefix) {
            System.out.println(1);
        } else if (isSuffix) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
    
}
