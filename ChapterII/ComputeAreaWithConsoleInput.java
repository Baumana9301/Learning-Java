/*Chapter II - Listing 2.2
 Computes Area with Consule Input
    rather than fixed radius. Intro
    to Scanner class and objects
 */

 package ChapterII;

 import java.util.Scanner;

 public class ComputeAreaWithConsoleInput
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius, area;

        System.out.print("Please enter a radius for the circle: ");
        radius = input.nextDouble();

        area = 3.14159 * radius * radius;

        System.out.println("A circle with radius " + radius + 
            " has an area of " + area + " units^2");
    }
 }