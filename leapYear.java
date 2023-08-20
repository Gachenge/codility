import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = myScanner.nextInt();
        myScanner.close();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.printf("The year %s is a leap year\n", year);
        }
        else{
            System.out.printf("Year %s is NOT a leap year\n", year);
        }
    }
}
