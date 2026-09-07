package Practice;

import java.util.Scanner;

public class PrimeNumber {
    // Any number which is divisible by 1 or itself is called prime number 

    // User will give you a Integer number and you have to check whether that number is prime or not 

    public static void main(String[] args) {
        System.out.println("Enter number to check: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i<n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("It is a Prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }

}
