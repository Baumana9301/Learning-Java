/* Chapter II - Listing 2.6 - FahrenheitToCelsius
 Program that converts Fahrenheit to Celsius*/

 package ChapterII;

 import java.util.Scanner;

 public class FahrenheitToCelsius
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a temperature in degrees F: ");
        double tempF = input.nextDouble();

        double tempC = (5.0 / 9) * (tempF - 32);
        System.out.println(tempF + " degrees F is equal to " + 
            tempC + " degrees C.");
    }
 }