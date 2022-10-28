package progamme;

import java.util.Scanner;

public class TaskOne {
    /*
    1. write a java programe that tells us that INput number is odd or even?
    HINT : use ternary opperator (?  :)
     */
    public static void main (String args []){
        // scanner declararion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter the number");
        int number = scanner.nextInt();

    }

    // Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        // ternary operator is used
        String evenOrOdd = ( number % 2 == 0) ? "Even"  : "Odd";
        System.out.println("The" + number + "is" +evenOrOdd + "number");



}}
