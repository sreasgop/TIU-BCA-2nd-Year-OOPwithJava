/*
3. A college has following rules for grading system:
    a. Below 30 - F
    b. 30 - 45 - E
    c. 45 - 50 - D
    d. 50 - 60 - C
    e. 60 to 80 - B
    f. Above 80 - A
*/
import java.util.Scanner;
class gradeCalculator{

    public static char calc(int Marks){
        
        if (Marks<30) {
            return 'F';
        }
        else if (Marks<=45) {
            return 'E';
        }
        else if (Marks<=50) {
            return 'D';
        }
        else if (Marks<=60) {
            return 'C';
        }
        else if(Marks<= 80){
            return 'B';
        }
        else {
            return 'A';
        }
    }
}

public class Q03_Grade {
    public static void main(String[] args) {
     
        Scanner Sc = new Scanner(System.in);
        int Marks;
        System.out.println("Enter Your Marks: ");
        Marks = Sc.nextInt();

        System.out.println("Your Grade is: "+ gradeCalculator.calc(Marks));
        Sc.close();

    }
    
}
