package v1ch6.clone;


import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 *
 * @version 0.1 2022-08-11
 * @author Shisen Wang
 */
public class Employee implements Cloneable
{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return hireDay;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDate = new GregorianCalendar(year, month - 1, day).getTime();
        this.hireDay.setTime(newHireDate.getTime());
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public Employee clone() throws CloneNotSupportedException
    {
        //call Object.clone()
        Employee cloned = (Employee) super.clone();

        //clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
