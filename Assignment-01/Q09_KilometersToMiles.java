// 9.	To determine the miles on the basis of given kilometers 

import java.util.Scanner;

public class Q09_KilometersToMiles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final float ONE_KILO_IN_MILES = 0.62137f;

        System.out.print("\nEnter value in Kilometers: ");
        float kilometers = sc.nextFloat();

        float noOfMiles = kilometers * ONE_KILO_IN_MILES;
        System.out.printf("Distance in Miles: %.2f", noOfMiles);

        sc.close();
    }
}
