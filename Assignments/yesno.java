package Assignments;
import java.util.Scanner;

public class yesno {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        String answer = "";

        System.out.println("Are you a girl?");
        System.out.println("Enter yes/no");
        answer = newscanner.nextLine();

        while (true) {

            if (answer.equals("no")){
                System.out.println("Hey boyy");
                break;
            }else if (answer.equals("yes")) {
                System.out.println("Hi gurlll");
                break;
        
            }else {
                System.out.println("You are an animal then!!...");
                break;
            }
            
        }
    }
    
}
