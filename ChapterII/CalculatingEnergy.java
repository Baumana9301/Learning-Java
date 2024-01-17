/*Chapter II - Practice Program 2.10 - Calculating Energy
 Reads in amount of water in kg, initial and final
    temps in C, returns energy in J
 */

 package ChapterII;

 import java.util.Scanner;

 public class CalculatingEnergy
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double water_kg, t0_C, t1_C, Q_J;

        System.out.print("Enter the amount of water in kg: ");
        water_kg = input.nextDouble();

        System.out.print("Enter the initial temperature (C): ");
        t0_C = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        t1_C = input.nextDouble();

        Q_J = water_kg * (t1_C - t0_C) * 4184; 

        System.out.print("The energy needed is " + Q_J + " Joules");
    }
 }