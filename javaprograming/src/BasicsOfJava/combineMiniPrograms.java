package BasicsOfJava;

public class combineMiniPrograms  {
    static void main() {

        // program to calculate area of circle...
        double radius = 10;
        double pi = 3.14;
        double Area = pi*radius*radius;
        System.out.println("The area of the circle with radius 10 is :"+Area);
// program to calculate percentage of 5 subjects:...
        double physics = 75;
        double chemistry = 82;
        double english  = 85;
        double ip = 95;
        double physical_edu = 79;
        double p = physics+chemistry+english+ip+physical_edu;
        System.out.println("The percantge of given sbubjects are :"+p/500*100);
        // simple interest program
        double pa,r,t,si,a;
        pa = 100000;
        r = 8;
        t = 5;
        si = (pa*r*t)/100;
        System.out.println("The total simple interest : " +si);
        a = si+pa;
        System.out.println("The total amount to pay after 5 years :"+a);

    }
}
