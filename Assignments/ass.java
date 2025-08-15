package Assignments;
import java.util.Scanner;
public class ass {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your birth year :");
       int myYear = scanner.nextInt();

       int currentYear = java.time.Year.now().getValue();

       int age = currentYear - myYear;

       System.out.println("You are" + age + "years old");

        // Calculate age based on birth year
        
    }
    
}
