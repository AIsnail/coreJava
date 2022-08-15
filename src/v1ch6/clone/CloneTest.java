package v1ch6.clone;


/**
 * This program demonstrates cloning.
 * @version 0.1 2022-08-11
 * @author Shisen Wang
 */
public class CloneTest
{
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
