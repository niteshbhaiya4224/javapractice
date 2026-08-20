package Practice;
import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random r = new Random();

    System.out.println("Rock, Paper, Scissors: ");
    String player = scan.next();

    int num = r.nextInt(3);

    String computer;

    if(num==0){
        computer = "Rock";
    }
     else if(num==1){
        computer = "Paper";
    }
     else{
        computer = "Scissors";
    }

    System.out.println("Computer: "+ computer);
    
    if(player.equals(computer)){
        System.out.println("tie");
    }
    else if(player.equals("Rock") && computer.equals("Scissors")){
        System.out.println("you win");
    }
    else if(player.equals("Paper") && computer.equals("Rock")){
        System.out.println("you win");
    }
    else if(player.equals("Scissors") && computer.equals("Paper")){
        System.out.println("you win");
    }
    else{
        System.out.println("computer wins");
    }
}
  
}

    

