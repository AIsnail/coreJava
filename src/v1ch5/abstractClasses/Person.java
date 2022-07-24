package v1ch5.abstractClasses;


/**
 *
 *
 * @version 0.1 2022-07-22
 * @author Shisen Wang
 */
public abstract class Person
{
    public abstract String getDescription();
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
