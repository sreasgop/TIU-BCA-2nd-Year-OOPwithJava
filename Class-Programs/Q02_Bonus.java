// 2. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount. 
import java.util.Scanner;
class bonusCalc{

    public static float Bonus(int Salary,int ServTime){
        if (ServTime>5) {
            return Salary*0.05f; // 5/100 = 0.05
        }
        else{
            return 0;
        }
    }
}

public class Q02_Bonus {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int Salary,ServTime;

        System.out.println("Enter Your Salary: ");
        Salary = Sc.nextInt();
        System.out.println("Enter Your Service Time in Company: ");
        ServTime = Sc.nextInt();
        System.out.println("Your Net Bonus is: "+bonusCalc.Bonus(Salary, ServTime));
        Sc.close();
    }
    
}
