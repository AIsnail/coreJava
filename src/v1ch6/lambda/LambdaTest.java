package v1ch6.lambda;


import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

/**
 * This program demonstrates the use of lambda expressions.
 * @version 0.1 2022-08-11
 * @author Shisen Wang
 */
public class LambdaTest
{
    public static void main(String[] args)
    {
        var planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sort in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sort by length:");
        Arrays.sort(planets, (String first, String second) -> {
            return first.length() - second.length();
        });
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000, (event) -> {
            System.out.println("The time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        
        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
