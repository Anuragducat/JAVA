package Conditionals;
import java.util.Scanner;
public class divisibleBy5or3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the divisibility :");
        int N = sc.nextByte();
        if (N%5==0 && N%3==0){
            System.out.println(N+ " is divisible by 3 and 5");
        }
        else {
            System.out.println(N+ " is not  divisible by 3 and 5");
        }
    }
}
