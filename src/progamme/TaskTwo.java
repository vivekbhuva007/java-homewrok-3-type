package progamme;

import java.util.Scanner;

public class TaskTwo {
    /*
    Write java programe to input any year like (ex. 2007) and find out if it is leap year or not?

     */
    public static void main(String args[]) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = scanner.nextInt();


    }

    // checking is it leap uyeaer or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year" + year + "is not a leap year");
            return;

        }
        System.out.println("the year" + year + "Is not a leap year");

    }

}
