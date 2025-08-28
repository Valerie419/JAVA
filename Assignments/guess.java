package Assignments;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        int guessno = 6;
        int userguess = 0;
        System.out.println("GUESS GUESS GUESS !!!");
        
        while (true) {
            System.out.println("Pick a number from 1-10");
            userguess = newscanner.nextInt();

            if (userguess != guessno){
                System.out.println("Wrongg...try again");

            }else {
                System.out.println("Correctt!!!!");
                break;
            }
            
        }
    }
    
}
