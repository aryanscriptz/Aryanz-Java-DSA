public class Factorialrecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

       //Base case
        static int factorial (int n) {

            if (n==0) {
                return 1; 
            }

        //Recursive call
         return n * factorial(n-1);
            
              }
            }
            