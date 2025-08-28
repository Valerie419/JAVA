package Assignments;
import java.util.Scanner;
public class adultapp {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        int age = 0;
        System.out.println("Adults Only!!");
       


        while (true) {
             System.out.println("Enter your age");
             age = newscanner.nextInt();


            if (age <18){ 
               System.out.println("You are a child!");
            }else if (age >=18){
                System.out.println("Welcome!!!");
                break;

            }else{
                System.out.println("Pls leave");
            } 
        }
    }
    
}
