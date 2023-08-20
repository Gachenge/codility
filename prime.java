import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        boolean prime = true;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its prime: ");
        int num = myScanner.nextInt();
        myScanner.close();
        for (int i=2; i < (num*0.5)+1; i++){
            if (num % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.printf("%d is a prime number\n", num);
        }
        else{
            System.out.printf("%d is NOT a prime number\n", num);
        }
    }
}
