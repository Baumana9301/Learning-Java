/*Chapter II Check Point 2.9.2, 2.9.3, 2.9.4
 -Show result of modulo operator
 -If today is Tuesday, what day will it be in 100 days?
 -Result of 25 / 4, -> float
 */

package ChapterII;

public class CheckPoint2_9_2
{
    public static void main(String[] args)
    {
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);

        //dayOfWeek = (2 + 100) % 7;
        System.out.println("If today is tuesday, in 100 days it will be Wednesday.");

        System.out.println(25 / 4);
        System.out.println(25.0 / 4);
    }
}