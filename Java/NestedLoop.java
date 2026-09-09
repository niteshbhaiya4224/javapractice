package Java;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        // for(int i =0; i<5; i++){ // Rows
        //     for(int j = 0; j<5; j++){ // Cols
        //         // System.out.print("("+i+","+j+")"+"  ");
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows...");
        int rows = sc.nextInt();
        int cols = (rows*2)-1;

        for(int i =1; i<=rows; i++){
            for(int j = 1; j<=cols; j++){
                if(j >= (rows-i+1) && j <= (rows+i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}


// Matrix 

/*

 1,3,5
 2,5,1
 3,4,1 -- 3x3

 +

 5,3,1
 3,2,1
 3,3,1 -- 3x3

= 


 6 6 6
 5 7 2
 6 7 2

*/

/*

         *
        ***
       *****
      *******  
     *********
      9X5

      I need 8 rows - (rows*2)-1;

*/