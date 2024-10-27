package homework_week_08;

/**Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.
 EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative

 NOTE: The method getEvenDigitSum should be defined as public static
 *
 */

public class Programme_11_EvenDigitSum {

    public static void main(String[] args) {
        // test cases
        System.out.println(getEvenDigitSum(123456789));// return 20
        System.out.println(getEvenDigitSum(252));// return 4

        System.out.println(getEvenDigitSum(-22));// return  -1
    }

   // declare method  getEvenDigitSum with one parameter of type int called number
    public static int getEvenDigitSum(int number){

        // return if the number is negative
        if(number<0){
            return -1;
        }
        int sum=0;

        // exract each digit
        while (number!=0){
            int digit = number%10;
            //check if the digit is even
            if (digit%2 == 0){
                sum += digit;
            }
            number/=10; // move to the next digit;

        }
        return sum;
    }

}
