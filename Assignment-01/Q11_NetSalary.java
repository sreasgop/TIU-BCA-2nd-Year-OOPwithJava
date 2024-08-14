// 11.	To determine the net salary of an employee when it is known that the employee is eligible to dearness allowance (DA) of 97% of the basic pay, House Rent Allowance (HRA) of 57% of the basic pay and medical allowance of Rs.150 . It is further known that 12% of the basic pay is deducted from the gross salary for the Employees’ Provident fund (EPF) and Rs. 200 is deducted from the gross pay as the professional tax.

import java.util.Scanner;

public class Q11_NetSalary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your base salary: ");
        float baseSalary = sc.nextFloat();

        float dearnessAllowance = (baseSalary * 97)/100;
        float houseRentAllowance = (baseSalary * 57)/100;
        float medicalAllowance = 150;

        float employeeProvidentFund = (baseSalary * 12)/100;
        float professionalTax = 200;
        
        float grossSalary = baseSalary + dearnessAllowance + houseRentAllowance + medicalAllowance;

        float netSalary = grossSalary - (employeeProvidentFund + professionalTax);

        System.out.println("Gross Salary: "+grossSalary+"\nNet Salary: " + netSalary);

        sc.close();

    }
}
