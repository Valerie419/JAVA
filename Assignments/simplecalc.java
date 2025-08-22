package Assignments;
import java.util.Scanner;
public class simplecalc {
    //two variable
    //output: sum, difference, product, quotient
    public static void main(String[] args) {
        //instantiate and object of the class
        Scanner newscanner = new Scanner(System.in);
        System.out.print("what is your first number: ");
        double num1 = newscanner.nextDouble();

        System.out.print("what is your second number: ");
        double num2 = newscanner.nextDouble();

         System.out.print("Choose an Operator(+, -, *, /): ");
        char op = newscanner.next().charAt(0);

        double result = 0;


        if (op == '+') {
            result = num1 + num2;
        } 
        else if (op== '-') {
            result = num1 - num2;
        } 
        else if (op == '*') {
            result = num1 * num2;
        } 
        else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
                return; // stop program
            }
        } 
        else {
            System.out.println("Invalid operator!");
            return;
        }

        // Printing the result
        System.out.println("Result: " + result);
    }


        // float sum = num1 + num2;
        // float difference = num1 - num2;
        // float product = num1 * num2;
        // float quotient = num1 / num2;

        /*
         * 
         * op
         * if(op == "sum")
         */

        // System.out.println("the sum is "+ sum);
        // System.out.println("the difference is : "+difference);
        // System.out.println("the product is " + product);
        // System.out.println("the quotient is "+ quotient);
        // newscanner.close();
}


