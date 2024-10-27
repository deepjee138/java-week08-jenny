package homework_week_08;

/**
 * [8:54 am, 27/10/2024] Jenny: Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * <p>
 * Example input/output
 * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * <p>
 * gives us 0+0 and the sum is 0.
 * <p>
 * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 * [8:55 am, 27/10/2024] Jenny:
 */

public class Programme_07_FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        // check for invalid numbers
        if (number < 0) {
            return -1;
        }
        // extract last digit number
        int lastDigit = number % 10;

        // Extract first Digit number
        int firstDigit = number;
        while (firstDigit >= number) {
            firstDigit /= 10;

        }
        // return the sum number of first and last
        return firstDigit + lastDigit;

    }

    public static void main(String[] args) {
        // test cases
        System.out.println(sumFirstAndLastDigit(252));// retun4
        System.out.println(sumFirstAndLastDigit(257));// return9
        System.out.println(sumFirstAndLastDigit(0));// return 0
        System.out.println(sumFirstAndLastDigit(5));//return 10
        System.out.println(sumFirstAndLastDigit(-10));//return -1


    }


}
