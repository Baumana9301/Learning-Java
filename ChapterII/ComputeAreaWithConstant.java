/*Chapter II Listing 2.4 - Compute Area With Constant
 This listing is an intro to constants (finals) in Java
 */

package ChapterII;

import java.util.Scanner;

public class ComputeAreaWithConstant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius, area;
        final double PI = 3.14159;

        System.out.print("Please enter a radius: ");
        radius = input.nextDouble();

        area = PI * radius * radius;

        System.out.println("The area of a circle with radius " + radius + 
            " is " + area + " units^2.");
    }
}