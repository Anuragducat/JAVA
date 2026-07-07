package Conditionals;
import java.util.Scanner;
public class YoungestAmong3 {
  public   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ram's age :");
        int Ram = sc.nextInt();
        System.out.println("Enter the Shyam's age :");
        int Shyam = sc.nextInt();
        System.out.println("Enter the Ajay's age :");
        int Ajay = sc.nextInt();
        if (Ram < Shyam && Ram < Ajay) {
            System.out.println( "Ram is Youngest");
        } else if (Shyam < Ram && Shyam < Ajay) {
            System.out.println( "Shyam is Youngest ");
        } else {// c has to be max
            System.out.println("Ajay is Youngest");

        }
    }
    }



