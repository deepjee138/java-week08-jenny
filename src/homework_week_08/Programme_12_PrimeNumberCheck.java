package homework_week_08;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.
 */

public class Programme_12_PrimeNumberCheck {

    public static void main(String[] args) {

        Programme_12_PrimeNumberCheck programme12PrimeNumberCheck = new Programme_12_PrimeNumberCheck();
        programme12PrimeNumberCheck.prime(); // method calling

    }

    // declare a instance method
    public void prime() {
        // declare a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = scanner.nextInt();


        // check the number is prime
        if (isPrime(number)) {
            System.out.println(number + "is a Prime number:");

        } else {
            System.out.println(number + " is not a Prime Number:");

        }
        // scanner close
        scanner.close();
    }

    //method for checking number is prime
    public static boolean isPrime(int number) {
        // add the number less than 2
        if (number < 2) {
            return false;
        }
        // check the divison from 2 up to the square root number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}