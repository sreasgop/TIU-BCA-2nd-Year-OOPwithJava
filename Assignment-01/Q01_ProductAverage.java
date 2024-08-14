// 1.	To determine the product and average of two given numbers. 

import java.util.Scanner;

public class Q01_ProductAverage {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float n1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float n2 = sc.nextFloat();

        float product = n1 * n2;
        float average = (n1+n2)/2;

        System.out.println("Product: "+product+"\nAverage: "+average);

        sc.close();

    }    
}

// Impplementing the logic using a class and static methods: 
// class Calculate{
//     public static float product(float num1, float num2){
//         float result = num1 * num2;
//         System.out.println("Product: "+result);
//         return result;
//     }

//     public static float average(float num1, float num2){
//         float result = (num1 + num2)/2;
//         System.out.println("Average: "+result);
//         return result;
//     }
// }