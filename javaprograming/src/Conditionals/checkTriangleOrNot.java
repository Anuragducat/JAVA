package Conditionals;
import java.util.Scanner;
public class checkTriangleOrNot {
  public   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frist side of the Triangle : ");
        int a = sc.nextInt();
        System.out.println("Enter the second side of the triangle :");
        int b = sc.nextInt();
        System.out.println("Enter the third side of the triangle :");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("valid Triangle ");
        }
        else {
            System.out.println("Invalid triangle ");
        }
    }
}
