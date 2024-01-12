//01.11.24 Workspace File 
package ChapterII;

import java.util.Scanner;

public class Workspace
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, average;

        System.out.print("Please enter 3 numbers: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        average = (n1 + n2 + n3) / 3;

        System.out.println("The average of " + n1 + ", " +
            n2 + ", and " + n3 + " is " + average);
    }
}
