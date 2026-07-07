package Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, j;
        boolean flag = false;

        System.out.print("Enter the number to check Prime or Composite: ");
        num = sc.nextInt();

        if (num == 1) {
            System.out.println("1 is neither prime nor composite number");
        } else {
            for (j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println("Prime Number");
            else
                System.out.println("Composite Number");
        }

        sc.close();
    }
}