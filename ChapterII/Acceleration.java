/*Chapter II - Prog. Exercise 2.9 - Acceleration
 Reads in v1, v0, and t
 Computes average acceleration in mps
 */

 package ChapterII;

 import java.util.Scanner;

 public class Acceleration
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double v0, v1, t, a;

        System.out.print("Enter starting velocity (m/s): ");
        v0 = input.nextDouble();
        
        System.out.print("Enter ending velocity (m/s): ");
        v1 = input.nextDouble();

        System.out.print("Enter the change in time (s): ");
        t = input.nextDouble();

        a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a + "m/s^2");
    }
 }