package homework_week_08;

import java.util.Scanner;

/**1. Read 10 numbers from the console entered by the user and print the sum of those
 numbers. -Use the hasNextInt() method from the scanner to check if the user has entered an int value. -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 10 numbers. -Use the nextInt() method to get the number and add it to the sum. -Before the user enters each number, print the message Enter number #x: where x represents the
 count, i.e. 1, 2, 3, 4, etc. -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 #2:, and so on.
 Hint:  -Use a while loop. -Use a counter variable for counting valid numbers. -Close the scanner after you don't need it anymore. -Create a class with the name ReadingUserInputChallenge.
 *
 */

public class Programme_01_ReadingUserInputChallenge {


    public static void main(String[] args) {

        // calling in to main method
     Programme_01_ReadingUserInputChallenge programme01ReadingUserInputChallenge=new Programme_01_ReadingUserInputChallenge();
     programme01ReadingUserInputChallenge.inPutChallenge();
    }

    // create a method
    public void inPutChallenge() {
        // declare the scanner
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        // use while loop
        while (count <= 10) {
            System.out.println("Enter a number" + count + ":");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");

            }
            scanner.nextInt(); // Clear the invalid


        }
        System.out.println(" The sum of the number 10 is:" + sum);
        // scanner close
        scanner.close();

    }
}