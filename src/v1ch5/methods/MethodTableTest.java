package v1ch5.methods;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This program demonstrates how to invoke methods through reflection.
 * @version 0.1 2022-08-09
 * @author Shisen Wang
 */
public class MethodTableTest
{
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        // get method pointers to the square and sqrt methods
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // print table of x- and y-values
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
        return;
    }

    public static double square(double x)
    {
        return x * x;
    }

    public static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
        // print out the method as table header
        System.out.println(f);

        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx)
        {
            double y = (Double) f.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
        return;
    }
}
