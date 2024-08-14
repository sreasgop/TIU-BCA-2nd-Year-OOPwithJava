// 4.	To determine the stock value of a store of certain item on the basis of its unit cost and quantities held in the stock.  

import java.util.Scanner;

public class Q04_StockValue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit cost of item: ");
        float unitCost = sc.nextFloat();

        System.out.print("Enter quantity held in stock: ");
        float quantity = sc.nextFloat();

        float stockValue = unitCost * quantity;
        System.out.println("Stock value of item: "+stockValue);

        sc.close();
    }
}
