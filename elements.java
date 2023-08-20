import java.util.Scanner;

public class elements {
    public static void main(String[] args){
        /*get the elements at odd positions of a number*/
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = myScanner.nextInt();
        myScanner.close();
        String numbers = Integer.toString(num);
        int maxi=0;
        System.out.print("The elements at odd index are: ");
        for (int i=0; i < numbers.length(); i++){
            char c = numbers.charAt(i);
            if (i % 2 != 0){
                System.out.print(c);
            }
            int k = Character.getNumericValue(c);
            if (k > maxi){
                maxi = k;
            }
        }
        System.out.println();
        System.out.printf("The biggest digit is %d\n",maxi);
    }
}
