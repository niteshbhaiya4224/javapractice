package Java;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int counter = 0;

        // while(check){
        //     System.out.println("Enter Numbers");
        //     int n = sc.nextInt();
        //     counter++;

        //     if(counter==10){
        //         check = false;
        //     }
        //     else if(n==0){
        //         check = false;
        //     }

        // }

        Random rand = new Random();

        while(check) {
            int n = rand.nextInt(1,100);
            System.out.println("Hitting random numbers......."+n);
            if(n==37){
                check = false;
            }
        }


        /*

        Enemy player ----VS-----  You

        Your health = 100;
        enemy health = 100;

        Per hit = -10;

        you will generate a random number of bound(1,3) - (1,2,3);

        whatever random number you got that means you have hit the enemy that much time - 

        Now next turn will be of enemy - and whatever random number they get that much multiplied by perHit will get reduced from you 

        If anytime anyone health become 0 that person will loose the game and opponent will win 
        
        */

    }
}
