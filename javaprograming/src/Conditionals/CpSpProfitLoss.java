package Conditionals;
import java.util.Scanner;
public class CpSpProfitLoss {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost price of the product :");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price of the prodcut");
        int sp = sc.nextInt();
        if(sp>cp) {
            System.out.print("your Profit is :");
            System.out.println(sp-cp);
        }
            else {
                System.out.print("you are in loss of :");
            System.out.println(cp-sp);

            }
        }
    }

