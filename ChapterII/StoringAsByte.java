//Chapter II - Storing input as a Byte

package ChapterII;

import java.util.Scanner;

public class StoringAsByte
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        byte n1;

        System.out.print("Please enter a value to be stored in a byte: ");
        n1 = input.nextByte();

        System.out.println(n1 + " has successfully been stored as a byte.");
    }
}