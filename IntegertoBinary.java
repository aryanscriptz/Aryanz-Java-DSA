import java.util.*;

public class IntegertoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is: " + binaryString);
    }
    
}
