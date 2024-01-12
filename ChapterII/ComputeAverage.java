/*Chapter II Listing 2.3 - Compute Average
 This program reads in 3 numbers and returns 
 the average value.
 */

 package ChapterII;

 import java.util.Scanner;

 public class ComputeAverage
 {
    public static void main(String[] args)
    {
        Scanner input;
        double  n1, n2, n3, average;

        input = new Scanner(System.in);

        System.out.print("Please enter 3 numbers: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        average = (n1 + n2 + n3) / 3;

        System.out.println("The average of " + n1 + 
            ", " + n2 + ", and " + n3 + " is " + average);
    }
 }