
import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int num = 0, numValues = 0;
        boolean valid = true;

        while(numValues < numbers.length){
            do { 
                valid = true;
                System.out.println("Plese enter a number: ");
                num = scanner.nextInt();

                for (int i = 0; i < numValues; i++) {
                    if(num == numbers[i]){
                        System.out.println("Number already exists");
                        valid = false;
                        break;
                    }
                }

            } while (!valid);

            numbers[numValues] = num;
            numValues++;
        }
        scanner.close();

        for(int numV: numbers){
            System.out.println("Number value: " + numV);
        }
    }
}
