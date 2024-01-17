/*Chapter II - Prog. Exercise 2.6 - Sum Digits in Integer
 Reads in an integer and sums the digits
 */

package ChapterII;

import java.util.Scanner;

public class SumDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, d1, d2, d3, d4, sum;

        System.out.print("Please enter an integer btwn 0-1000: ");
        n1 = input.nextInt();

        d1 = n1 % 10;
        n2 = n1 / 10;
        d2 = n2 % 10;
        n3 = n2 / 10;
        d3 = n3 % 10;
        n4 = n3 / 10;
        d4 = n4 % 10;
        
        sum = d1 + d2 + d3 + d4;

        System.out.println("The sum of the digits is " + sum);

    }
}