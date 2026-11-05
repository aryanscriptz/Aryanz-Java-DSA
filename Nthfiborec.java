public class Nthfiborec {

    public static void main(String[] args) {
        int n = 50;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
            sum += fib;
        }

        System.out.println("\nSum = " + sum);
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

    
