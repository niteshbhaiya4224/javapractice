package Practice;
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
import java.util.Random;
public class EnemyvsYou {
        public static void main(String[] args) {
                Random random = new Random();
                int yourHealth = 100;
                int enemyHealth = 100;
                int perHit = 10;
                
                while(yourHealth > 0 && enemyHealth > 0){
                        int yourHits = random.nextInt(4);
                        int yourDamage = yourHits * perHit;
                        enemyHealth = enemyHealth - yourDamage;

                        if(enemyHealth <0){
                                enemyHealth = 0;
                        }
                        System.out.println("Hits: "+ yourHits);
                        System.out.println("Enemy Health: "+ enemyHealth);

                        if(enemyHealth == 0){
                                System.out.println("you win");
                                break;
                        }

                        int enemyHits = random.nextInt(4);
                        int enemyDamage = enemyHits * perHit;
                        yourHealth = yourHealth - enemyDamage;

                        if(yourHealth < 0){
                                yourHealth=0;
                        }
                        System.out.println("Enemy hit you: "+ enemyHits);
                        System.out.println(yourHealth);

                        if(yourHealth == 0){
                                System.out.println("Enemy wins");
                        }

                }
                
        }
    
}
