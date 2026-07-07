package Conditionals;
import java.util.Scanner;
public class GreatestOfThree {
  public   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int A = sc.nextInt();
        System.out.println("Enter the Second number :");
        int B = sc.nextInt();
        System.out.println("Enter the Third number :");
        int C = sc.nextInt();
        if (A>B && A>C){// A is  max
            System.out.println(A+" is greatest");
        }
        else if(B>C && B>A) {// B is max
            System.out.println(B + " is  greatest ");
        }
        else {// c has to be max
            System.out.println(C+" is greatest");
        }
    }
}
