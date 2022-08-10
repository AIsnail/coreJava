package v1ch5.interfaces;


import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 * @version 0.1 2022-08-10
 * @author Shisen Wang
 */
public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff)
        {
            System.out.println(e.toString());
        }
    }
}
