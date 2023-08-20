import java.util.Scanner;
import java.lang.Math;

public class cardinals {
    public static void main(String [] args){
        /*string of arrows, eaqch pointing to a different cardinal point
find the minimum number of arrows that must be rotated so they all point
in the same direction */
        Scanner myScanner = new Scanner(System.in);
        String points = myScanner.nextLine();
        myScanner.close();
        int up = 0, left = 0, down = 0, right = 0;
        for (int i = 0; i < points.length(); i++){
            char c = points.charAt(i);
            if (c == '<'){
                left++;
            }
            else if (c == '^'){
                up++;
            }
            else if (c == '>'){
                right++;
            }
            else if (c == 'v'){
                down++;
            }
            else{
                System.out.printf("Wrong input, '%s' not supported", c);
                return;
            }
        }
        int max = Math.max(Math.max(Math.max(down, right), up), left);
        int num = points.length();
        if (num-max == 0){
            System.out.println("All points to the same direction");
        }
        else{
            System.out.println(num-max);
        }
    }
}
