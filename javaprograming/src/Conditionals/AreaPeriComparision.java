package Conditionals;
import java.util.Scanner;
public class AreaPeriComparision {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = sc.nextInt();
        System.out.println("Enter the breadth :");
        int breadth = sc.nextInt();
        int Area = length*breadth;
        int perimeter = 2 * (length+breadth);
        if (Area>perimeter){
            System.out.println("The area is greater than perimeter");
        }
        else{
            System.out.println("The perimeter is greater than area");
        }
    }
}
