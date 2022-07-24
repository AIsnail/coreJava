package v1ch5.abstractClasses;

/**
 *
 *
 * @version 0.1 2022-07-24
 * @author Shisen Wang
 */
public class Student extends Person
{
    private String major;

    /**
     *
     *
     * @param name     student name
     * @param major    major class
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
