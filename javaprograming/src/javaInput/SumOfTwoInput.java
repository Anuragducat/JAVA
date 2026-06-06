
package javaInput;
import java.util.Scanner;
public class SumOfTwoInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x = sc.nextInt();
        System.out.print("Enter the second number :");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum of given numbers is :"+sum);

        //  program to calculate speed
        System.out.print("Enter the distance travelled in KM : " );
        double distance = sc.nextInt();
        System.out.print("Enter the time taken is hours :");
        double time = sc.nextDouble();
        double speed = distance/time;
        System.out.print("The speed of the object is: "+speed+"Km/hr");

    }
}

