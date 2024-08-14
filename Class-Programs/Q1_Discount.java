// 1. A shop will give discount of 15% if the cost of purchased quantity is more than 500.

import java.util.Scanner;

public class Q1_Discount{

    public static float applyDiscount(float amtSpent){
        float discountAmt = 0.0f;
        float amtPayble = amtSpent;

        if(amtSpent>500){
            discountAmt = (amtSpent%15)/100;
            amtPayble = amtSpent - discountAmt;
            System.out.printf("Discount of %.2f applied!\n", discountAmt);
        } else {
            System.out.printf("%.2f is uneligible for discount!\n", amtSpent);
        }
        
        return amtPayble;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter cost of purchased quantity: ");
        float amt = sc.nextFloat();

        System.out.println("Amount Payable: " + applyDiscount(amt));;
        sc.close();
    }
}