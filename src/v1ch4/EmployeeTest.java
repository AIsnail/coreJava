package v1ch4;


import java.lang.annotation.ElementType;
import java.time.LocalDate;

/***
 * This program tests the Employee class.
 * @version 0.1 2022-07-03
 * @author wang
 */
public class EmployeeTest
{
    public static void main (String[] args)
    {
        //fill the staff array with three Employee objects
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee2("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee2("Tony Tester", 40000, 1990, 3, 15);

        //raise everyone's salary by 5%
        for (Employee2 e : staff)
        {
            e.raiseSalary(5);
        }

        //print out information about all Employee objects
        for (Employee2 e : staff)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}

class Employee2
{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee2(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPresent)
    {
        double raise = salary * byPresent / 100;
        salary += raise;
    }
}
