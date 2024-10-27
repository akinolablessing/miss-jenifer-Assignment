import java.util.Scanner;
  public class Integer{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);


    int number;

  System.out.print("Enter a number:");
   number = scanner.nextInt();

  if (number > 0){
    
System.out.print(" positive number "); 
   }
   else{
  System.out.print(" negative number "); 
    }

  }
 }