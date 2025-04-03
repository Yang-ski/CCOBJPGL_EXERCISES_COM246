import java.io.File;
import java.io.FileReader;
import java.nio.file.FileSystemLoopException;
import java.util.Scanner;  
public class Main {
    public static void main(String[] args) throws Exception {
/*
        System.out.print("Enter your username:");

        Scanner loginScanner = new Scanner(System.in);

        String userInput = loginScanner.next();

        System.out.print("Enter your Password:");
        String passInput = loginScanner.next();

        System.out.println("Your Username: " + userInput);
        System.out.println("Your Password: " + passInput);

        User me = new User(userInput, passInput);

        File myFile = new File("Accounts.txt");

        if (myFile.exists()) {
            System.out.println("File Exists");
        }

        Boolean loginSuccess = false;

        Scanner fileScanner = new Scanner(myFile);

        while (fileScanner.hasNextLine()) {
            String filedata = fileScanner.nextLine();
            System.out.println(filedata);

            String usernameInput = filedata.split(",")[0];
            String passwordInput = filedata.split(",")[1];

            if (usernameInput.equals(userInput) && passwordInput.equals(passInput)) {
                loginSuccess = true;
            }
        }

        if (loginSuccess) {
            System.out.println("Login Success, Hello " + me.getUsername());
        } else {
            System.out.println("Unsuccessful Login.");
        }
    }
}
*/

    DataScientist dataScientist1 = new DataScientist("John", null, null);

    System.out.println("My Name is " + dataScientist1.name);
    System.out.println("My Work is " + dataScientist1.getWork());
    System.out.println("My Salary is " + dataScientist1.getSalary());

    Researcher researcher1 = new Researcher("Jane", null, null);
    
    System.out.println("My Name is " + researcher1.name);
    System.out.println("My Work is " + researcher1.getWork());
    System.out.println("My Salary is " + researcher1.getSalary());
    }
} 
