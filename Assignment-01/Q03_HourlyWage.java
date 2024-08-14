// 3.	To determine wage of workers for certain hours of work at a given hourly rate.

import java.util.Scanner;

public class Q03_HourlyWage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours worked: ");
        float hoursWorked = sc.nextFloat();

        System.out.print("Enter hourly rate: ");
        float hourlyRate = sc.nextFloat();

        float wage = hoursWorked * hourlyRate;
        System.out.println("Wage: " + wage);

        sc.close();
    }
}
