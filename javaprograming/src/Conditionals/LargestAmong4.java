package Conditionals;

import java.util.Scanner;

public class LargestAmong4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        if (a >= b && a >= c && a >= d) {
            System.out.println("Greatest Number = " + a);
        }
        else if (b >= a && b >= c && b >= d) {
            System.out.println("Greatest Number = " + b);
        }
        else if (c >= a && c >= b && c >= d) {
            System.out.println("Greatest Number = " + c);
        }
        else {
            System.out.println("Greatest Number = " + d);
        }

        sc.close();
    }
}