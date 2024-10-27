package homework_week_08;

import java.util.Scanner;

/**Write a program to input any number and check if it Armstrong number or not
 153 = (1*1*1)+(5*5*5)+(3*3*3)
 where:
 (1*1*1)=1
 (5*5*5)=125
 (3*3*3)=27
 So:
 1+125+27=153
 *
 */


public class Programme_10_ArmstrongNumberCheck {

    public static void main(String[] args) {
        Programme_10_ArmstrongNumberCheck programme10=new Programme_10_ArmstrongNumberCheck();// calling instance to static
        programme10.armstrong();

    }

    // declare the instance method
    public void armstrong(){
        // scanner declare
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();


        // check the number is armstrong number
        if (isArmStrong(number)) {
            System.out.println(number + "isArmStrong number:");
        } else {
            System.out.println(number + "Is not an ArmStrong Number:");
        }
        // scanner close;
        scanner.close();
    }

    // method to check if the number is armstrong number
    public static boolean isArmStrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // calculate the sum of cubs
        while (number!=0){
        int digit = number % 10;
        sum += Math.pow(digit, 3);
        number /= 10;
    }
        // comapre to the sum with original
       return sum== originalNumber;
    }
}