//ChapterII = 2.9 - MathPow intro

package ChapterII;

import java.util.Scanner;

public class MathPowTesting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1;
        double n2, n3;

        System.out.print("Please enter a base: ");
        n1 = input.nextInt();

        System.out.print("Please enter a power: ");
        n2 = input.nextDouble();
        n3 = Math.pow(n1, n2);

        System.out.println(n1 + " raised to the " + n2 +
            " power is equal to " + n3);
    }
}