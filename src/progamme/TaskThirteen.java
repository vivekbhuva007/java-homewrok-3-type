package progamme;

import java.util.Scanner;

public class TaskThirteen {
    /* Write a java program which input any number between 1 to 7 and it print the days
    name MONDAY, TUESDAY,   ..... SUNDAY of the week accordingly by using the switch
    NOTE: if number is out of selection print rhe message "Week contains 1 to 7 days "
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 : ");
        int day = scanner.nextInt();
        findTheDaysName(day);
        //Closing the scanner object
        scanner.close();
    }

    // Finding the name of the day
    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
    }


