package v1ch3;

import java.util.Scanner;

/***
 * This program demonstrates <code>while</code> loop.
 * @version 0.1 2022-06-25
 * @author wang
 */
public class Retirement
{
    public static void main(String[] args)
    {
        //input your data
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        var goal = in.nextDouble();

        System.out.println("How much money will you be contribute every year?");
        var payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        var interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;


        //update account balance while goal isn't reached
        while (balance < goal)
        {
            //add this year's payment and interest
            balance += payment;
            var interest = balance * interestRate;
            balance += interest;
            years++;
        }

        //print the time of retirement
        System.out.println("You can retire in " + years + " years.");
    }
}
