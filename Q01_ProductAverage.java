// 1.	To determine the product and average of two given numbers. 

import java.util.Scanner;

class Calculate{
    public static float product(float num1, float num2){
        float result = num1 * num2;
        System.out.println("Product: "+result);
        return result;
    }

    public static float average(float num1, float num2){
        float result = (num1 + num2)/2;
        System.out.println("Average: "+result);
        return result;
    }
}

public class Q01_ProductAverage {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float n1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float n2 = sc.nextFloat();

        Calculate.product(n1, n2);
        Calculate.average(n1, n2);


    }    
}
