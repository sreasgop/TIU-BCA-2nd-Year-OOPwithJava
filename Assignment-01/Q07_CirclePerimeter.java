// 7.	To determine the perimeter of a circular plot 
// Circumference = 2πr
import java.util.Scanner;

public class Q07_CirclePerimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;

        System.out.print("Enter the radius of circular plot: ");
        float radius = sc.nextFloat();

        float circumferece = (2 * PI * radius);
        System.out.printf("Perimeter of the circular plot: %.1f", circumferece);

        sc.close();

    }
}
