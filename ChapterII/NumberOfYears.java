/*Chapter II - Prog. Exer. 2.7 - Number Of Years 
Reads in minutes, returns maximum number of years and 
remaining days
*/

package ChapterII;

import java.util.Scanner;

public class NumberOfYears
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int minutes, days, years;

        System.out.print("Please enter a quantity of minutes: ");
        minutes = input.nextInt();

        years = minutes / (60 * 24 * 365);
        days = (minutes / (60 * 24)) % 365;

        System.out.println(minutes + " minutes is approximately " + 
            years + " years and " + days + " days.");
    }
}