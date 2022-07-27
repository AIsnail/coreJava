package v1ch5.equals;


import v1ch5.Employee;

/**
 *
 *
 * @version 0.1 2022-07-27
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

    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject))
        {
            return false;
        }

        var other = (Manager) otherObject;
        //super.equals checked that this and other belong to the same class
        return bonus == this.bonus;
    }

    public int hashCode()
    {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}