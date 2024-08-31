
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int user_age; 
        char liscence;

        System.out.println("Hey there! What's your age? ");
        user_age = scanner.nextInt();
        
        System.out.println("Hey there! Do you have a adriving liscence? ");
        liscence = scanner.next().charAt(0);
        
        if((user_age >= 21 ) && (liscence == 'y')){
            System.out.println("You are an adult and can drive a car");
        }else {
            System.out.println("You are not an adult");
        }
        
        scanner.close();
    }
}
