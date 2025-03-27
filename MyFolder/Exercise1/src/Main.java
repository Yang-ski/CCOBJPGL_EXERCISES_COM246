import java.util.Scanner;  
public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("Enter your username:");

        Scanner loginScanner = new Scanner(System.in);

        String userInput = loginScanner.next();

        System.out.print("Enter your Password:");
        String passInput = loginScanner.next();

        System.out.println("Your Username: " + userInput);
        System.out.println("Your Password: " + passInput);
    }
}
