package homework_week_08;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered. -Before the user enters the number, print the message Enter number:  -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:  -Use an endless while loop.  -Create a class with the name MinAndMaxInputChallenge.
 */

public class Programme_02_MinAndMaxInputChallenge {


    public static void main(String[] args) {

        // calling in to main method
        Programme_02_MinAndMaxInputChallenge programme02MinAndMaxInputChallenge = new Programme_02_MinAndMaxInputChallenge();
        programme02MinAndMaxInputChallenge.minAndMax();

    }

    // instance method declare
    public void minAndMax() {
        // scanner declaration
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstlnput = true;

        while (true) {
            System.out.println("Enter a number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // update a minimum and maximum values
                if (firstlnput) {
                    min = number;
                    max = number;
                    firstlnput = false;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number < max) {
                        max = number;
                    }

                }
            } else {

                // if input is valid, break out of loop
                System.out.println("invalid nuber");
                break;


            }
            scanner.nextLine();

        }
        // print the two value
        if (!firstlnput) {
            System.out.println("Minimum number enter:" + min);
            System.out.println("Minimum number enter:" + max);
        } else {
            System.out.println(" No valid enter number:");
        }
        // scanner close
        scanner.close();


    }
}


