package v1ch3;


import java.util.Arrays;
import java.util.Scanner;

/***
 * This program demonstrates array manipulation.
 * @version 0.1 2022-06-29
 * @author wang
 */
public class LotteryDrawing
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        //get input
        System.out.println("How many numbers do you need draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        //fill an array with numbers 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
        }

        //draw k numbers and put them into second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            //make a random index between 0 and n-1
            int index = (int) (Math.random() * n);

            //pick the element at the random location
            result[i] = numbers[index];

            //move the last element into the random location
            numbers[index] = numbers[n-1];
            n--;
        }

        //print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It will make you rich!");
        for (int e: result)
        {
            System.out.printf("%d ", e);
        }
    }
}
