import java.util.*;
public class Shitingstacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
            int n = sc.nextInt();
            long[] h = new long[n];
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextLong();
            }

            boolean possible = true;

            for (int i = 1; i < n; i++) {
                if (h[i] <= h[i - 1]) {
                    long need = h[i - 1] - h[i] + 1;

                    if (h[i - 1] < need) {
                        possible = false;
                        break;
                    }

                    h[i - 1] -= need;
                    h[i] += need;
                }

                if (h[i] <= h[i - 1]) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}