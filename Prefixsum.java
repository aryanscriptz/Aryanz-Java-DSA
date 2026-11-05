import java.util.*;

public class Prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long ans = 0;
            long prefixSum = 0;
            Map<Long, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                prefixSum += arr[i];

                if (prefixSum == 0) {
                    ans++;
                }

                ans += map.getOrDefault(prefixSum, 0);
                map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }

            System.out.println(ans);
        }

        sc.close();
    }
    
}
