package v1ch3;

import java.math.*;
import java.util.*;

/***
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * @version 0.1 2022-06-25
 * @author wang
 */
public class BigIntegerTest
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many number do you need to draw? ");
        var k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        var n = in.nextInt();

        /**
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*...*k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
        {
            lotteryOdds *= (n - i + 1) / i;
        }
        System.out.println("Your lottery odds are 1 in " + lotteryOdds + ". Good luck! ");
    }
}
