// 2.	To determine the simple interest of a given amount of money at a given rate of interest for a given period in years. 

// Formula to calculate simple interest = amount * rate * time

import java.util.Scanner;

public class Q02_SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of money: ");
        float amt = sc.nextFloat();
        
        System.out.print("Enter rate of interest: ");
        float rate = sc.nextFloat();
        
        System.out.print("Enter time period in years: ");
        float time = sc.nextFloat();        

        float simpleInterest = amt*rate*time;
        System.out.println("Simple Interest: "+simpleInterest);

        sc.close();
    }
}
