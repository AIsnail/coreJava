package v1ch4;


/***
 * This program demonstrates static method.
 * @version 0.1 2022-07-06
 * @author wang
 */
public class StaticTest
{
    public static void main (String[] args)
    {
        //fill the staff array with tree Employee objects
        var staff = new EmployeeTwo[3];

        staff[0] = new EmployeeTwo("Tom", 40000);
        staff[1] = new EmployeeTwo("Dick", 60000);
        staff[2] = new EmployeeTwo("Harry", 65000);

        //print out information about all Employee objects
        for (EmployeeTwo e : staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        //calls static method
        int n = EmployeeTwo.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class EmployeeTwo
{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public EmployeeTwo(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        //set id to next available id
        id = nextId;
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;
    }

    /***
     * unit test
     * @param args
     */
    public static void main (String[] args)
    {
        var e = new EmployeeTwo("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }


}
