public class Printrecursion {
    public static void main(String[] args) {
        p(5);

    }
    //Base case
     static void p(int n) {
        if (n == 0) {
            return;
        }
        //Recursive call first
        p(n - 1);
        
        //Print while returning
         System.out.println(n);
       
    }
}
