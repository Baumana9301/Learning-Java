/*Programming Exercise 2.2 - Volume of a Cylinder
Reads in radius and length of a cylinder
Returns Volume
 */

package ChapterII;

import java.util.Scanner;

public class VolumeOfCylinder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius, length, volume, area;
        final double PI = 3.14159;

        System.out.print("Please the radius of the cylinder: ");
        radius = input.nextDouble();

        System.out.print("Please enter the length of the cylinder: ");
        length = input.nextDouble();

        area = PI * Math.pow(radius, 2);
        volume = area * length;

        System.out.println("A cylinder with a radius of " + 
            radius + "units has an area of " + area + 
            "units^2 and a volume of " + volume + "units^3.");

    }
}