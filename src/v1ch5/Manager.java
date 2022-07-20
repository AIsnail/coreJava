package v1ch5;


import java.time.LocalDate;

/**
 *
 *
 * @version 0.1 2022-07-20
 * @author Shisen Wang
 */
public class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    @Override
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }
}
