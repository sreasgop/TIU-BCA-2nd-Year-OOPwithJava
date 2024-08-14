// 8.	To determine the area and perimeter of a square. 
// Formula = 4 x Sides

import java.util.Scanner;

public class Q08_SquarePerimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of side: ");
        float side = sc.nextFloat();

        float perimeter = 4 * side;

        System.out.printf("Perimeter of Square: %.1f", perimeter);

        sc.close();

    }
}
