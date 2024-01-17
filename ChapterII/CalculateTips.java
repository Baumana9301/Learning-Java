/*Chapter II - Programming Exercise 2.5 - Financial Application
 Reads in subtotal and gratuity rate,
 calculates tip amount and total
 */

package ChapterII;

import java.util.Scanner;

public class CalculateTips
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double subtotal, grat_rate_p, grat_rate, grat, total;

        System.out.print("Please enter the checks subtotal: $");
        subtotal = input.nextDouble();

        System.out.print("Please enter the gratutuity rate (full %): ");
        grat_rate_p = input.nextDouble();

        grat_rate = grat_rate_p / 100;
        grat = subtotal * grat_rate;
        total = subtotal + grat;

        System.out.println("Gratuity is $" + grat + 
            " and total is $" + total);
    }
}