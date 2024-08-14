// 6.	To determine the area of the walls of a rectangular room and hence the cost of its painting on the basis of charge per square unit. 

import java.util.Scanner;

public class Q06_PaintingCost {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter height of wall: ");
        float wallHeight = sc.nextFloat();

        System.out.print("Enter length of the wall: ");
        float wallLength = sc.nextFloat();

        System.out.print("Enter cost of paint (per Sq. Unit): ");
        float cost = sc.nextFloat();

        float wallArea = wallHeight * wallLength;
        float totalCost = wallArea * cost;

        System.out.printf("Total Area of Wall: %.2f unit sq.\nTotal Cost to Paint: %.2f\n", wallArea, totalCost);

        sc.close();

    }
}
