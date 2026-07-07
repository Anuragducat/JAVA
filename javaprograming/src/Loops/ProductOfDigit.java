package Loops;
import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int num,product=1,last_digit;
        num = sc.nextInt();
        while (num != 0 ) {
            last_digit = num % 10;
            product *= last_digit;
            num = num / 10;
        }
        System.out.println("Product of digit is :"+product);
    }
}
