import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);    
        double payment = myScanner.nextDouble();
        myScanner.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String in = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
