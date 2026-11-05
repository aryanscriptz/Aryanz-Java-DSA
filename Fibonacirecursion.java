public class Fibonacirecursion {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    //Base case
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        //Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

     }
