package Conditionals;
import java.util.Scanner;
public class ThreeDigit {
  public   static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the digit :");
        int N = sc.nextInt();
        if (N>99 && N<1000){
            System.out.println("Three digit number");}
            else {
                System.out.println("Not a three digit number");
            }
        }
    }

