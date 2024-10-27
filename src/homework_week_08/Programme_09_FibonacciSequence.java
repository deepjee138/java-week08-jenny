package homework_week_08;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number
 */

public class Programme_09_FibonacciSequence {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scanner=new Scanner(System.in);

        // prompt user for the number
        System.out.println("Enter the number of term to display in the Fibonacci sequence:");
        int terms=scanner.nextInt();

        // initialize the first two term of the f.s
        int first= 1,second = 1;

        // check if at least one term is requested
        if(terms>=1){
            System.out.println(first +"");

        }
if (terms>=2){
    System.out.println(second +"");
}
// generate fibonacci seq
        for (int i =3;i<=terms;i++){
            int next=first+second;
            System.out.println(next + "");
            first=next;
        }
        // scanner close
        scanner.close();
    }



    }

