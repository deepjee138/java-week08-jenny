package homework_week_08;

import java.util.Scanner;

/**6. Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 *
 */

public class programme_06_NumberTriangle {


    public static void main(String[] args) {
        triangle(); // direct calling


    }
    public static void triangle(){

        // scanner declaration

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number of the row");
        int raw=scanner.nextInt();


        // generate tje triangle pattern
        for (int i = 1; i < raw; i++){
            for (int j=1; j<=i; j++){
                System.out.println(j);
            }
            System.out.println();
        }
        // scanner close
        scanner.close();
    }
}
