/*Chapter I Practice Program XI
 Population Projection for the next 5 years
 One birth every 7 seconds
 One death every 13 seconds
 One new immigrant every 45 seconds
 Current population: 312032486
 */

package ChapterI;

public class PEXI
{
    public static void main(String[] args)
    {
        System.out.println(312032486 + (31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45)); //YEAR! ~31536000 seconds in a year
        System.out.println(314812583 + (31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45)); //YEAR2
        System.out.println(317592680 + (31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45)); //YEAR3
        System.out.println(320372776 + (31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45)); //YEAR4
        System.out.println(323152873 + (31536000.0 / 7) - (31536000.0 / 13) + (31536000.0 / 45)); //YEAR5
    }
}