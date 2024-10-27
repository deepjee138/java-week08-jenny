package homework_week_08;

import java.util.Scanner;

/**Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 *
 */

public class Programme_15_LeftAngleTriangle {

    public static void main(String[] args) {
        triangle(); // calling static

    }
    // declare a static method
    public static void triangle(){

        // scanner create
        Scanner scanner=new Scanner(System.in);

        // enter a value
        System.out.println("Enter the number of the row:");
        int row=scanner.nextInt();

        // generate the left triangle
        for (int i =1; i<=row;i++){
            for (int j=1; j<=i;i++){
                System.out.println("*");
            }
            System.out.println();
        }

        //scanner close
        scanner.close();
    }
}
