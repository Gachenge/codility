import java.util.Scanner;

public class exam {
    public static void main(String[] args){
        /* a student can only sit for their exams if they attend atleast 75% of 
         * their classes or if they have medical reasons
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Total number of classes attended: ");
        int clas = myScanner.nextInt();
        System.out.println("Classes available? ");
        int tot = myScanner.nextInt();
        double perc = ((double) clas / tot) * 100;
        if (perc > 75) {
            System.out.printf("You are free to do the exams. You attended %.2f%% classes\n", perc);
        }
        else{
            myScanner.nextLine();
            System.out.println
            ("You did not attend enough classes. Was this because of medical reasons? Reply 'Y' or 'N': ");
            String input = myScanner.nextLine();
            char ans = input.charAt(0);
            myScanner.close();
            if (ans == 'Y'){
                System.out.printf("You attended only %.2f%% of classes. However, due to medical reasons, you can take the exams.\n", perc);
            }
            else if (ans == 'N'){
                System.out.printf("You attended only %.2f%% of classes. You will not take the exams.\n", perc);
            }
            else{
                System.out.printf("Wrong input\n");
            }
        }
    }
}
