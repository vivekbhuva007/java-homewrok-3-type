package progamme;

import java.util.Scanner;

public class TaskSix {

    // Write a javaa programe to input any number and find out if its odd or even .
        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number you want to check : ");
            int number = scanner.nextInt();
            TaskSix oddEven = new TaskSix();
            System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
            // Closing the scanner object
            scanner.close();
        }

        // Checking the odd or even
        public String isItEvenOrOddNumber(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
    }


