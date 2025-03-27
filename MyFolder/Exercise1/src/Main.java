import java.io.File;
import java.io.FileReader;
import java.nio.file.FileSystemLoopException;
import java.util.Scanner;  
public class Main {
    public static void main(String[] args) throws Exception {

        /*System.out.print("Enter your username:");

        Scanner loginScanner = new Scanner(System.in);

        String userInput = loginScanner.next();

        System.out.print("Enter your Password:");
        String passInput = loginScanner.next();

        System.out.println("Your Username: " + userInput);
        System.out.println("Your Password: " + passInput);*/

        File myFile = new File("Accounts.txt");

        if (myFile.exists()) {
            System.out.println("File Exists");
        }

        Scanner fileScanner = new Scanner(myFile);

        while (fileScanner.hasNextLine()) {
            String filedata = fileScanner.nextLine();
            System.out.println(filedata);
            
        }
    }
}
