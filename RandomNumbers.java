import java.util.Random;
   import java.util.Scanner;
     public class RandomNumbers{
       public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
          int random =  Random(100);

          System.out.print("Guess a number from 0 - 100:");
          int guess = scanner.nextInt();
         
         if (guess > random ){
          System.out.print(" It is too high, try again!!");
     }   
    }
   }	