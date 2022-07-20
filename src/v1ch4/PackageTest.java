package v1ch4;
// import v1ch4.Employee;
// the Employee class is defined in that package.

import static java.lang.System.*;

/***
 * This program demonstrates the use of packages.
 * @version 0.1 2022-07-12
 * @author Shisen Wang
 */
public class PackageTest
{
    public static void main(String[] args)
    {
        //because of the import statement, we don't have to use
        //v1ch4.Employee here
        var harry = new Employee("Harry Hacker", 50000);

        harry.getSalary();

        //because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
