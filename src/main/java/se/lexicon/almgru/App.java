package se.lexicon.almgru;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        printOutName("Daniel");
    }

    // Syntax: <access modifier> <static/instance> <return type> <name> <parameters> <body>
    // Needs to be inside class or interface.
    public static void name() { }

    public static void printOut() {
        System.out.println("Hello World - From Method");
    }

    public static void printOutName(String name) {
        System.out.print("Hi, the name is: ");
        System.out.println(name);
    }
}
