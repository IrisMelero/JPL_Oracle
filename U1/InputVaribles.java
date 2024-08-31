import java.util.Scanner;

public class InputVaribles {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        boolean bool_val;
        byte byte_val;
        char char_val;
        short short_val;
        int int_val;
        long long_val;
        float float_val;
        double double_val;
    
        System.out.println("Please enter a boolean value: ");
        bool_val = in.nextBoolean();
        in.close();


    }
}
