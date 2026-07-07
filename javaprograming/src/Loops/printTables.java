package Loops;
import java.util.Scanner;
public class printTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want table of :");
        int N = sc.nextInt();
        for (int i=1; i<=10;i++){
            System.out.println(N+" x " +i+" = "+ i*N);
        }
    }
}
