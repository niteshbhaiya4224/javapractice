package Practice;
import java.util.Random;
import java.util.Scanner;
public class GuesstheNumber {
    //You have to get a Random number between 1 to 100
    // 56
    // 34 - 67 - 45 - 55 - 56
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    int num = random.nextInt(100)+ 1;
    int guess = 0;
    int tries = 0;

    while(guess != num){
        System.out.println("Guess from 1 to 100");
        guess = scan.nextInt();
        
        tries++;


        if(guess < num){
            System.out.println("too low");
        }
        else if(guess > num){
            System.out.println("too high");
        }
        else{
            System.out.println("correct");
            System.out.println("Number of tries: "+ tries);
        }
    }

    }

}
