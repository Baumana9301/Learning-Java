/* Chapter II - Programming Exercise 2.1
 Coverts Celsius to Fahrenheit */

package ChapterII;

import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double tempC, tempF;

        System.out.print("Please enter a temperature in Celsius: ");
        tempC = input.nextDouble();

        tempF = ((9.0 / 5) * tempC) + 32;

        System.out.println(tempC + " C = " + tempF + " F");

    }
}