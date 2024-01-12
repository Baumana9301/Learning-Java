/*Chapter II Listing 2.1 - Compute Area
 Computes area of circle using a fixed radius*/

package ChapterII;
public class ComputeArea
{
    public static void main(String[] args)
    {
        double radius=20, area;

        area = 3.14159 * radius * radius;

        System.out.println("A circle with radius " + radius + " units is: " + area + " units^2.");
    }
}