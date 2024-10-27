package homework_week_08;

import java.util.Scanner;

/**8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 *
 */

public class Programme_08_AtSymbolTriangle {


    public static void main(String[] args) {
        Programme_08_AtSymbolTriangle programme08AtSymbolTriangle=new Programme_08_AtSymbolTriangle();
        programme08AtSymbolTriangle.triangle();

    }
    public void triangle(){

        // create a scanner
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter  a row:");
        int row=scanner.nextInt();

        // Generate the triangle pattern
        for (int i = 1;i<=row;i++){
            for (int j = 1; j<=i; j++){
                System.out.println("@");
            }
            System.out.println();
        }
        // scanner close
        scanner.close();
    }
}
