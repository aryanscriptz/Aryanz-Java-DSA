import java.io.*;
import java.util.*;

public class Hack1 {
    private static final int METER_CHARGE = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");

        int units = scanner.nextInt();
        long totalBill = calculateElectricityBill(units);

        if (totalBill <= 0) {
            System.out.println("Invalid Units");
        } else {
            System.out.println( totalBill);
        }

        scanner.close();
    }

    public static long calculateElectricityBill(int units) {
        if (units <= 0) {
            return -1;
        }

        long bill = 0;

        if (units <= 100) {
            bill = units * 2L;
        } else if (units <= 200) {
            bill = 100 * 2L + (units - 100) * 3L;
        } else {
            bill = 100 * 2L + 100 * 3L + (units - 200) * 5L;
        }

        return bill + METER_CHARGE;
    }
}