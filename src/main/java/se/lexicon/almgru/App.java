package se.lexicon.almgru;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        printOut("name", "Daniel");
        printOut("age", "30");

        double result = addition(20.5, 60);
        System.out.println(result);
    }

    // Syntax: <access modifier> <static/instance> <return type> <name> <parameters> <body>
    // Needs to be inside class or interface.
    public static void name() { }

    public static void welcomeMessage() {
        System.out.println("Hello World - From Method");
    }

    public static void printOut(String what, String name) {
        System.out.print("The " + what + " is: ");
        System.out.println(name);
    }

    public static double addition(double number1, double number2) {
        double result;

        result = number1 + number2;

        return result;
    }
}
