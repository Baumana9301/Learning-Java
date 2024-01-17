/*Chapter II - Prog. Exercise 2.4 - Lb to Kg 
Reads in weight in lb and converts to kg
*/

package ChapterII;

import java.util.Scanner;

public class PoundsToKilograms
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double lb, kg;
        final double LB_TO_KG = 0.454;

        System.out.print("Please enter a weight in lbs: ");
        lb = input.nextDouble();

        kg = lb * LB_TO_KG;

        System.out.println(lb + "lbs = " + kg + "kg");
}
}