
import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;
        
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            
            System.out.print("Do you want to continue (Y/N)? ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        
        scanner.close();
        
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
    }
}
