/*******************************************************
 * Name:
 * Assignment: A02
 *******************************************************/

public class A02
{
    public static void main(String[] args)
    {
        // example 0
        System.out.println("\n\nExample 0:");
        System.out.print("***");
        System.out.print("!!!");
        System.out.print("ooo");

        // example 1
        System.out.println("\n\nExample 1:");
        String name = "Susan";
        int age = 8;
        System.out.println(name + " is " + age + " years old.");

        // example 2
        System.out.println("\n\nExample 2:");
        int number = 10;
        System.out.println("2 * " + number + " = " + 2 * number);

        // example 3
        System.out.println("\n\nExample 3:");
        int side = 5;
        System.out.println("Side: " + side + " Perimeter: " + side * 3);

        // example 4
        System.out.println("\n\nExample 4:");
        int y = 456;
        System.out.println("The value of y is " + y + ".");
        System.out.println( y%1000/100 + " " + y%100/10 + " " + y%10);

        // example 5
        System.out.println("\n\nExample 5:");
        int number1 = 24;
        if (number1 % 7 == 0)
        {
            System.out.println(number1 +" is a multiple of 7.");
        }
        if (number1 % 7 != 0)
        {
            System.out.println(number1 + " is not a multiple of 7.");
        }

        // example 6
        System.out.println("\n\nExample 6:");
        String shape = "triangle";
        if (shape == "triangle")
        {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
        }

        // example 7
        System.out.println("\n\nExample 7:");
        int n1 = 1;
        int n2 = 3;
        int n3 = 5;
        System.out.println("Number\t Square");
        System.out.println(n1 + "\t" + n1 * n1);
        System.out.println(n2 + "\t" + n2 * n2);
        System.out.println(n3 + "\t" + n3 * n3);

	}
}