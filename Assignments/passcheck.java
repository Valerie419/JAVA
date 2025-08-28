package Assignments;
import java.util.Scanner;

public class passcheck {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        String password = "val419";
        String userPassword = " ";

        System.out.println("Enter your password");
        userPassword = newscanner.nextLine();

        while (userPassword.equals(password)) {
            System.out.println("Access Granted");
            break;
            
        }
        
        
    }
    
}
