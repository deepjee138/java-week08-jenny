package homework_week_08;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */


public class Programme_03_VowelOrConsonant {


    public static void main(String[] args) {

        Programme_03_VowelOrConsonant programme03VowelOrConsonant=new Programme_03_VowelOrConsonant();
        programme03VowelOrConsonant.consonant();  // calling via object

    }

    public void consonant() {

        // scanner declare
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String input = scanner.nextLine();

        // check the input is a single latter
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = Character.toLowerCase(input.charAt(0));


            // check is the letter is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
                System.out.println("input letter is vowel:");
            } else {
                System.out.println("Input letter is consonant:");
            }
            }else{
                System.out.println("Error: Invalid input:");
            }
            // scanner close
            scanner.close();
        }

    }



