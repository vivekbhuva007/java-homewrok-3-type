package progamme;

import java.util.Scanner;

public class TaskFIve {
    /*
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * | Salary Slip |
     * |______________________________|
     * | Employee Id : 2564 |
     * | Employee Name : Jay |
     * |______________________________|
     * | Basic Salary : 25000.0 |
     * | HRA 10% : 2500.0 |
     * | DA 8% : 2250.0 |
     * | TA 9% : 2000.0 |
     * | PF - 20%; : 5000.0 |
     * |______________________________|
     * | Gross Salary : 26750.0 |
     * |===========================|
     */
     public static void main (String args[]){
         // Scanner declararion for reading inout from console
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your name:  ");
         String name= scanner.nextLine();

         System .out.println("Enter your EmpoyeeId:  ");
         int employeeId = scanner.nextInt();

         System.out.println("Enter basic salary:  ");
         double basicSalary = scanner.nextInt();

         // calculcating /hra, /DA, TA, and PF

         double hra = calculateHRA(basicSalary);
         double da = calculateDA(basicSalary);
         double ta = calculateTA(basicSalary);
         double pf = calculatePF(basicSalary);

         // calculating gross salary
         double grossSalary = basicSalary +hra + da+ ta + - pf ;


         System.out.println("---------------------------------------");
         System.out.println("|Salary Slip                          |");
         System.out.println("|-------------------------------------|");
         System.out.println("|Employee ID:" + employeeId + "                     |");
         System.out.println("|Employee Name:" + name + "                    |");
         System.out.println("|-------------------------------------|");
         System.out.println("|Basic Salary: " + basicSalary + "                |");
         System.out.println("|HRA 10%     : " + hra + "                 |");
         System.out.println("|TA 8%       : " + ta + "                 |");
         System.out.println("|DA 9%       : " + da + "                 |");
         System.out.println("|PF -20%     : " + pf + "                |");
         System.out.println("|-------------------------------------|");
         System.out.println("|Gross Salary: " + grossSalary + "                |");
         System.out.println("|-------------------------------------|");

         // Closing scanner object
         scanner.close();






     }
     // Calculating HRA
    public static double calculateHRA(double basicSalary){
         return (basicSalary*10) /100;

    }
    // Calculating DA
    public static double calculateDA(double basicSalary){
         return (basicSalary * 8) / 100;


} // calculating TA
    public static double calculateTA(double basicSalary){
         return (basicSalary * 9) /100;

    }
     // Calculating PF
    public static double calculatePF (double basicSalary){
         return (basicSalary* 20) /100;
    }

}
