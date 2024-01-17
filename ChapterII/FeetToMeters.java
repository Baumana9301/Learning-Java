/*Chapter II - Programming Exercise 2.3 - Feet -> Meters
Reads in a value in ft and converts to m
 */

package ChapterII;

import java.util.Scanner;

public class FeetToMeters
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double ft, m;
        final double FT_TO_M = 0.305;

        System.out.print("Please enter a quantity in ft: ");
        ft = input.nextDouble();
        
        m = ft * FT_TO_M;

        System.out.println(ft + "ft = " + m + "m");
    }
}