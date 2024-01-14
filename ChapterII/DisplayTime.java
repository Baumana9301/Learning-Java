/*Chapter II - Listing 2.5 - DisplayTime
Reads in amount in seconds and returns
amount in minutes with remainder*/

package ChapterII;

import java.util.Scanner;

public class DisplayTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int seconds, minutes, remSeconds;

        System.out.print("Please enter the total amount of seconds: ");
        seconds = input.nextInt();

        minutes = seconds / 60;
        remSeconds = seconds % 60;

        System.out.println(seconds + " seconds is equal to " + 
            minutes + " minutes and " + remSeconds + " seconds.");
    }
}