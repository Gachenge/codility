import java.util.Scanner;

public class bonuses {
    //give 5% bonus to employees if this is past their 5th year of service
    public static void main(String [] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.print("How many years have you worked here?: ");
    int years = myScanner.nextInt();
    System.out.print("What is your current salary?: ");
    int salary = myScanner.nextInt();
    myScanner.close();
    double bonus = 0;
    if (years > 5){
        bonus = 0.05 * salary;
    }
    System.out.print(bonus);
}
}
