import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String str = myScanner.nextLine();
        myScanner.close();
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            str1 += str.charAt(str.length()-1-i);
        }
        System.out.println(str1);
    }
}
