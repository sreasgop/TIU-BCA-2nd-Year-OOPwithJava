// 10. To determine the compound interest of a given amount of money at a given rate of interest for a given period in years.

import java.util.Scanner;

public class Q10_CompoundInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of money: ");
        float principleAmount = sc.nextFloat();

        System.out.print("Enter the rate of interest: ");
        float rateOfInterest = sc.nextFloat();

        System.out.print("Enter the period of time: ");
        float time = sc.nextFloat();

        // When interest is compounded annually 
        double amount = principleAmount * Math.pow((1+rateOfInterest/100), time);
        double compoundInterest = amount - principleAmount;

        System.out.printf("Compound Interest: %.2f", compoundInterest);

        sc.close();

    }
}
