package v1ch5.enums;


import java.util.Scanner;

/**
 * This program demonstrates enumerated types.
 *
 * @version 0.1 2022-08-04
 * @author Shisen Wang
 */
public class EnumTest
{
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("Enter Size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();

        Size size = Size.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE)
        {
            System.out.println("Good job--you paid attention to the _.");
        }
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
}
