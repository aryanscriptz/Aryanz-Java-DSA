public class Oddnumberupto100 {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 1) {
                System.out.print(i + " ");
            }
        }
    }
    
}
