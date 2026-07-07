package Conditionals;
import java.util.Scanner;
public class NestedifGreatestAmong3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number :");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Greatest = " + a);
            } else {
                System.out.println("Greatest = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest = " + b);
            } else {
                System.out.println("Greatest = " + c);
            }
        }
        sc.close();
    }
}
