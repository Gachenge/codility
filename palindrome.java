import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        /* chack if string is a palindrome */
        boolean pali = true;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the string to check if palindrome: ");
        String str = myScanner.nextLine();
        myScanner.close();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                pali = false;
                break;
            }
        }
        if (pali){
            System.out.printf("%s - is a palindrome\n", str);
        }
        else {
            System.out.printf("%s - is NOT a palindrome\n", str);
        }
    }
}
