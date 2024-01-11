/*Chapter I Programming Exercise XIII
 2x2 Linear Equations
 Use Cramer's rule to Solve
 3.4x + 50.2y = 44.5
 2.1x + .55y = 5.9 */

package ChapterI;

public class PEXIII
{
    public static void main(String[] args)
    {
        System.out.println(((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))); //x
        System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .44) - (50.2 * 2.1))); //y
    }
}