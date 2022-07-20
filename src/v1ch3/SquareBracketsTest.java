package v1ch3;


/***
 * This program demonstrates the properties of [] check out boundary and don't admit move point by +1.
 * @version 0.1 2022-06-28
 * @author wang
 */
public class SquareBracketsTest
{
    public static void main(String[] args)
    {
        int[] numbers = new int[]{1, 2, 3};
        int i = 0;
        //System.out.println(numbers[4]);
        while ( i < numbers.length)
        {
            System.out.println(numbers[i++]);
        }
    }
}
