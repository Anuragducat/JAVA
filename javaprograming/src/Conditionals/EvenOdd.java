package Conditionals;
import java.util.Scanner;

public class EvenOdd {
  public   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(n%2==0) {// n even hai
            System.out.println("The entered number is even");}
            else { // n odd hai
                System.out.println("The entered number is odd");
            }
        System.out.println();
    }
}
