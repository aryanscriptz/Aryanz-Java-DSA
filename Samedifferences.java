import java.util.*;

public class Samedifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Map<Integer, Integer> map = new HashMap<>();
            long ans = 0;

            for (int i = 0; i < n; i++) {
                int key = sc.nextInt() - i;

                int freq = map.getOrDefault(key, 0);
                ans += freq;
                map.put(key, freq + 1);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

