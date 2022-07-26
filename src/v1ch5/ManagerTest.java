package v1ch5;


/**
 * This program demonstrates inheritance.
 *
 * @version 0.1 2022-07-30
 * @author Shisen Wang
 */
public class  ManagerTest
{
    public static void main(String[] args)
    {
        //construct a Manager object
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        //fill the staff array with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tom Tester", 40000, 1990, 3, 15);

        //can‘t find method setBonus()
        // staff[0].setBonus(10000);

        //print out information about all Employee objects
        for (Employee e : staff)
        {
            System.out.println(
                    "name=" + e.getName() + ",salary=" + e.getSalary()
            );
        }
        return;
    }
}
