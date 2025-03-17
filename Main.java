//Main class

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        //System.out.println("hello world"); //print text to screen Console.WriteLine();
        //how to do console.readln();

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = scanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("what year were you born in?");

        int year = scanner.nextInt();

        int age = 2025-year;

        System.out.println("You are "+age+"years old.");



    }



}