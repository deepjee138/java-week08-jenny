package homework_week_08;

/**Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.
 EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 NOTE: The method hasSharedDigit should be defined as public static
 *
 */

public class Programme_13_SharedDigitChecker {


    public static void main(String[] args) {
        // test case
        System.out.println(hasSharedDigit(12,23));//true
        System.out.println(hasSharedDigit(9,99));//false
        System.out.println(hasSharedDigit(15,55));//true

    }
    public static boolean hasSharedDigit(int num1,int num2){

        // number are within range 10-99
        if(num1<10 || num1>99 || num2<10|| num2>99){
    return false;
        }
        // extract digit number
        int num1FirstDigit=num1/10;
        int num1SecondDigit=num1%10;
        int num2FirstDigit=num2/10;
        int num2SecondDigit=num2%10;

        // check shard digit
        return (num1FirstDigit==num2FirstDigit
                ||num1SecondDigit==num2SecondDigit||
                num1SecondDigit==num2FirstDigit
                ||num1SecondDigit==num2SecondDigit);


    }
}
