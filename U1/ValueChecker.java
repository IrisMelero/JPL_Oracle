
import java.util.Scanner;

public class ValueChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do{
            System.out.println("Digite um número, vejamos se ele dá sorte ou não! ");
            value = scanner.nextInt();
            if(value == 7){
                System.out.println("Número de sorte!");
            
            }else if(value == 13){
                System.out.println("Número de azar!");
                
            }else{
                System.out.println("Número nem de sorte nem de azar.");
            }

        }while(value != 0);

    }
    
}
