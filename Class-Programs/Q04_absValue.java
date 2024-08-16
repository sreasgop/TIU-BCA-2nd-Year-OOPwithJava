/*
4. Write a program to print absolute value of a number entered by user. E.g. -
INPUT: 1        OUTPUT: 1
INPPUT: -1      OUTPUT: 1
*/
import java.util.Scanner;

public class Q04_absValue {
    public static void main(String[] args) {
        int userInp;
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        userInp = Sc.nextInt();
        
        if(userInp >=0){
            System.out.println("Absolute Value of "+ userInp + " is "+ userInp);
        }
        else{
            System.out.println("Absulute Value of "+ userInp+" is "+ userInp*(-1));
        }
    }
}
