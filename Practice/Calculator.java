package Practice;
import java.util.Scanner;

public class Calculator {
    // User Will give input from the keyboard and you need to do operation like : + , -, x, /, %
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = scan.nextDouble();

        System.out.println("Enter operation (+,-,*,/,%)");
        String op = scan.next();

        System.out.println("Enter second number");
        double num2 = scan.nextDouble();

        if(op.equals("+")){
            System.out.println(num1+num2);
        }
        else if(op.equals("-")){
            System.out.println(num1-num2);
        }
        else if(op.equals("*")){
            System.out.println(num1*num2);
        } 
        else if(op.equals("/")){
            System.out.println(num1/num2);
        }
        else if(op.equals("%")){
            System.out.println((num1/100)*num2);
        }
        else{
            System.out.println("invalid");
        }
    }
}
    