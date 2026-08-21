package Practice;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        // Print number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Print the reverse from 10 to 1
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }
        // Print all the even numver from 1 to 30

        for (int b = 2; b <= 30; b += 2) {
            System.out.println(b);
        }
        // print all the numbers from 1 to 100 that are divisible by 5

        for (int t = 1; t <= 100; t++) {
            if (t % 5 == 0) {
                System.out.println(t);
            }
        }


        // You have to take a number - 541237 you have to print the total number of digit i.e 6
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scan.nextInt();
        int count = 0;
       
        if(num == 0){
            count = 1;
        }else{
            for(int i = num; i != 0; i =i/10){
            count++;
            }
        }
        System.out.println(count);
    }
}


     

    

    
