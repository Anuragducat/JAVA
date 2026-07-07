package Loops;

import java.util.Scanner;

public class Ap {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int a = 3;
        int d= 4;
        for (int i=1 ; i<=n ; i++){
            System.out.println(a+" ");
            a+=d;
        }
        // gp to print 1 2 4 8 16 32 . . .
        System.out.println("Enter no of terms od gp :");
        int N = sc.nextInt();
        int b= 1, r=2;
        for (int i = 1; i <=N ; i++) {
            System.out.print(b+" ");
            b*=r;
        }
    }
}
