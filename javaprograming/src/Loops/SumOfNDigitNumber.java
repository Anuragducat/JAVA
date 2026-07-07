package Loops;
import java.util.Scanner;
public class SumOfNDigitNumber {
  public   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0,digit;
        System.out.println("Enter the digit :");
         num = sc.nextInt();
        while (num!=0)
        {
            digit = num%10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("The sum of the digit is :" +sum);
    }
}

