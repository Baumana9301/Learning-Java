//Chapter II Checkpoint 2.7.2 - Miles to KM

package ChapterII;

public class CheckPoint2_7_2
{
    public static void main(String[] args)
    {
        double miles = 100, kilometers;
        final double KILOMETERS_PER_MILE = 1.609;

        kilometers = miles * KILOMETERS_PER_MILE;

        System.out.println(miles + " miles is equal to " + kilometers + 
            " kilometers.");
    }
}