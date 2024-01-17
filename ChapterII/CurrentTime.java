/*Chapter II - 2.13 - Current Time
 Program that uses the 1970 UNIX epoch 
 to display current tme in hr:min:s
 */

package ChapterII;

public class CurrentTime
{
    public static void main(String[] args)
    {
        long totalSeconds, totalMinutes, totalHours;
        long currentSecond, currentMinute, currentHour;
        long epochMillis = System.currentTimeMillis();

        totalSeconds = epochMillis / 1000;
        currentSecond = totalSeconds % 60;

        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;

        totalHours = totalMinutes / 60;
        currentHour = totalHours % 24;

        System.out.println("Current time: " + currentHour + ":" +
            currentMinute + ":" + currentSecond + " GMT");

    }
}