public class Sumrecursion {
    public static void main(String[] args) {
        System.out.print(sum( 5));
    }
    //Base case
    static int sum(int n) {
        if (n == 0) {   
            return 0;
        }
        //Recursive call
        return n + sum(n - 1);
    }
}