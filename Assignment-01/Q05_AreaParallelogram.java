// 5.	To determine the area of a parallelogram 

import java.util.Scanner;

public class Q05_AreaParallelogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter length: ");
        float length = sc.nextFloat();

        System.out.print("Enter breadth: ");
        float breadth = sc.nextFloat();

        float area = length * breadth;
        System.out.printf("Area of parallelogram: %.2f unit sq.\n", area);

        sc.close();
    }
}
