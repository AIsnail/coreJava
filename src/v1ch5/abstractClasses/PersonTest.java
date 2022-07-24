package v1ch5.abstractClasses;


/**
 * This program demonstrates abstract classes.
 *
 * @version 0.1 2022-07-24
 * @author Shisen Wang
 */
public class PersonTest
{

    public static void main(String[] args)
    {
        //fill the people array with Student and Employee objects
        var people = new Person[2];
        people[0] = new Employee("Harry Hacker", 50000, 2022, 7, 24);
        people[1] = new Student("Maria Morris", "computer science");

        //print name and description of all Person objects
        for (Person p : people)
        {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
