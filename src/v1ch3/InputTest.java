package v1ch3;

import java.util.*;

import java.util.*;

/***
 * This program demonstrates console input.
 * @vesion 0.1 2022-06-21
 * @author wang
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //get first input
        System.out.println("What you name?");
        var name = in.nextLine();

        //get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        //display output in console
        System.out.printf("Hello, " + name +". Next year, you will be " + (age + 1) + ".");
    }
}
