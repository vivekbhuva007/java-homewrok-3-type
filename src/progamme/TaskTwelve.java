package progamme;

import java.util.Scanner;

public class TaskTwelve {
    /* Write a program that tells us input value is number or an alphabet or symbol.

     */

    public static void main(String args[]) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);


    }

    // find the input value is Alphabet , digit and symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch > 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "is an ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "ia a DIGIT.");


        } else {
            System.out.println(ch + "is a Symbol. ");

        }

    }
}
