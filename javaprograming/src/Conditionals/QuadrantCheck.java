package Conditionals;

import java.util.Scanner;

public class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Enter the value of x: ");
        x = sc.nextDouble();

        System.out.print("Enter the value of y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("The point lies in the First Quadrant.");
        }
        else if (x < 0 && y > 0) {
            System.out.println("The point lies in the Second Quadrant.");
        }
        else if (x < 0 && y < 0) {
            System.out.println("The point lies in the Third Quadrant.");
        }
        else if (x > 0 && y < 0) {
            System.out.println("The point lies in the Fourth Quadrant.");
        }
        else if (x == 0 && y != 0) {
            System.out.println("The point lies on the Y-axis.");
        }
        else if (x != 0 && y == 0) {
            System.out.println("The point lies on the X-axis.");
        }
        else {
            System.out.println("The point lies at the Origin.");
        }

        sc.close();
    }
}