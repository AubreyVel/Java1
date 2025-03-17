//Main class

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        //System.out.println("hello world"); //print text to screen Console.WriteLine();
        //how to do console.readln();

       // Scanner scanner = new Scanner(System.in);  // Create a Scanner object
       // System.out.println("Enter username");

       // String userName = scanner.nextLine();  // Read user input
        //System.out.println("Username is: " + userName);  // Output user input

       // System.out.println("what year were you born in?");

       // int year = scanner.nextInt();

       // int age = 2025-year;

       // System.out.println("You are "+age+"years old.");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter First number");
        int firstNum = myObj.nextInt();

        System.out.println("Enter second number");
        int secondNum = myObj.nextInt();

        System.out.println("Enter third number");
        int thirdNum = myObj.nextInt();

        //System.out.println("largest number: " + Math.max(Math.max(firstNum, secondNum), Math.max(secondNum, thirdNum)));

        int largest = 0;

        if (firstNum>=secondNum && firstNum> thirdNum)
        {
            largest = firstNum;
        }

















    }



}