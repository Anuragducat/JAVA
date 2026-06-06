package javaInput; //IT Signifies that ki we are writing code in java input name folder..
import java.util.Scanner;
public class AreaOfCircleWithInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc ki jagah we can try anything..
        System.out.println("Enter radius :");
        int radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("The area of the circle is :"+area);
    }
}
