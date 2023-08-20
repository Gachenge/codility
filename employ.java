import java.util.Scanner;

public class employ {
    public static void main(String[] args){
        /*post employees by their age and gender */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Are you male or female? Enter 'M' or 'F': ");
        String input = myScanner.nextLine();
        char s = input.charAt(0);
        System.out.println("Are you married? Answer: 'Y' or 'N': ");
        input = myScanner.nextLine();
        //char m = input.charAt(0);
        System.out.println("How old are you? ");
        int age = myScanner.nextInt();
        myScanner.close();
        if (age < 20){
            System.out.println("You are underage");
        }
        else if (age > 60){
            System.out.println("Please retire");
        }
        else if (s == 'F' || age >= 40){
            System.out.println("You will work in urban areas");
        }
        else if (age >= 20 && age < 40){
            System.out.println("You will work anywhere");
        }
    }
}
