import java.util.Scanner;

public class fibonacci {
    public static int fibonacci2(int number){
        if (number == 1 || number ==2){
            return 1;
        }
        return(fibonacci2(number-1)+fibonacci2(number-2));
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = myScanner.nextInt();
        myScanner.close();
        for (int i=1; i<=num; i++){
            System.out.printf(" %d",fibonacci2(i));    
        }
        System.out.println();
    }
}
