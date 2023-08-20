import java.util.Scanner;

public class discounts {
    public static void main(String[] args){
        /*give 10% discounts to costs of over 1000 every item costs 100 */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many items did you buy? ");
        int items = myScanner.nextInt();
        myScanner.close();
        double discount = 0;
        if (items > 10){
            discount = 0.1 * items * 100;
        }
        System.out.println(discount);
    }  
}
