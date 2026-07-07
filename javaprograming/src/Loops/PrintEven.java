package Loops;

import java.util.Scanner;

public class PrintEven {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i =1;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        // Printing Odd numbers
        for (int i =1;i<=100;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
        // Printing number divisible by 3
        for (int i =1;i<=100;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
