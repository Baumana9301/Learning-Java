/*Chapter II - Checkpoint 2.12.1 - Writing Expressions*/

package ChapterII;

import java.util.Scanner;

public class CheckPoint2_12_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a, b, c, d, r, t, sola;
        double solb;

        System.out.print("Please enter an int for variable a: ");
        a = input.nextInt();

        System.out.print("Please enter an int for variable b: ");
        b = input.nextInt();

        System.out.print("Please enter an int for variable c: ");
        c = input.nextInt();

        System.out.print("Please enter an int for variable d: ");
        d = input.nextInt();

        System.out.print("Please enter an int for variable r: ");
        r = input.nextInt();

        System.out.print("Please enter an int for variable t: ");
        t = input.nextInt();

        sola = (4 / (3 * (r + 34))) - (9 * (a + (b * c))) + ((3 + (d * (2 + a))) / (a + (b * d)));
        solb = (5.5 * Math.pow((r + 2.5), (2.5 + t)));

        System.out.println("Solution a: " + sola);
        System.out.println("Solution b: " + solb);
        
    }
}