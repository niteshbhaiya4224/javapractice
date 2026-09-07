package Practice;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    // 5! = 5 * 4 * 3 * 2 * 1 = 120
    // 7! = 7 * 6 * 5! = 5040
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number");
        int num = scan.nextInt();

        // long factorial = 1;

        // if(num < 0){
        //     System.out.println("no negative number");
        // }else{
        //     for(int i = 1; i <= num; i++){
        //         factorial = factorial * i;
        //     }
        //     System.out.println("factorial: "+ factorial);
        // }


        // To maintain the overflow we have to use BigInteger

        BigInteger factorial = new BigInteger("1");

        for(int i = 1; i<=num; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}
