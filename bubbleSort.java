import java.util.ArrayList;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args){
        /* implement bubble sort */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array when done enter any character: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        while (myScanner.hasNextInt()){
            numbers.add(myScanner.nextInt());
        }
        myScanner.close();
        boolean swap;
        for (int i = 0; i < numbers.size()-1; i++){
            swap = false;
            for (int j = 0; j < numbers.size()-1; j++){
                if (numbers.get(j) > numbers.get(j + 1)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, temp);
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        System.out.println(numbers);
    }
}
