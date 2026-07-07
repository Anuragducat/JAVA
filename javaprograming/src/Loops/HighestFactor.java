package Loops;
import java.util.Scanner;
public class HighestFactor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hf=1;
        System.out.println("Enter the value of N :");
        int n = sc.nextInt();
        for (int i=n-1;i>1 ; i--) {
            if (n%i==0) {
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
