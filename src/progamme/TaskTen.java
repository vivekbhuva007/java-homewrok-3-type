package progamme;

import java.util.Scanner;

public class TaskTen {
    /* Write a java programe to input ant two number and ask user to enter their symbol (+, -, /, *) find addition
    subtraction  multiplication and division according to their symbol
    (Using if else)
     */

    public static void main (String args[]){

        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number  : ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number  : ");
        int y = scanner.nextInt();
        System.out.println("Please selsect the calculation symbol +, -, *, /, :");
        char symbol = scanner.next().charAt(0);

    }
    // Calculating operation based on symbol
    public static void doOperationSelectingSymbol (int x, int y, char symbol){
        if (symbol == '+'){
            System.out.println(x + "+ " + y + "=" + (x+y));
        } else if (symbol == '-') {
            System.out.println(x + "-" + y + " = " + (x - y));
        }
            else if (symbol == '*') {
                System.out.println(x + " x " + y + " = " + (x * y));
            } else if (symbol == '/') {
                System.out.println(x + " / " + y + " = " + (x / y));
            } else {
                System.out.println("Please enter correct symbol +,-,*,/");
            }
        }
    }

