//you have 8 apples in total of equal weight but one of them is of uneven weight(heavier) and u have a weighing machine(tarazu) to find out the heavier one.

import java.util.Scanner;

public class Apples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] apples = new int[8];

        for (int i = 0; i < 8; i++) {
            apples[i] = sc.nextInt();
        }

        int group1 = apples[0] + apples[1] + apples[2];
        int group2 = apples[3] + apples[4] + apples[5];

        if (group1 > group2) {
            if (apples[0] > apples[1])
                System.out.println("Heavier apple is at position 1");
            else if (apples[1] > apples[2])
                System.out.println("Heavier apple is at position 2");
            else
                System.out.println("Heavier apple is at position 3");
        } else if (group2 > group1) {
            if (apples[3] > apples[4])
                System.out.println("Heavier apple is at position 4");
            else if (apples[4] > apples[5])
                System.out.println("Heavier apple is at position 5");
            else
                System.out.println("Heavier apple is at position 6");
        } else {
            if (apples[6] > apples[7])
                System.out.println("Heavier apple is at position 7");
            else
                System.out.println("Heavier apple is at position 8");
        }

        sc.close();
    }
}