  import java.util.*;
    public class Prefnsuf2 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        boolean isPrefix = true;
        boolean isSuffix = true;                          

       for (int i = 0; i < N; i++) {
            if (S.charAt(i) != T.charAt(i)) { 
                isPrefix = false;
                break;                                              
            }
        }

         for (int i = 0; i < N; i++) {
            if (S.charAt(i) != T.charAt(M - N + i)) {
                isSuffix = false;
                break;
            }
        }

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

    

