package Loops;
import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'Enter the Digit :");
        int num ,rev = 0;
        num = sc.nextInt();
        while(num!= 0){
            rev = rev*10+(num%10);
            num = num/10;
        }
        System.out.println("The reverse of the given digit is :" +rev);
    }
}
