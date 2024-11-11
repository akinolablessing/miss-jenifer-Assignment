import java.util.Scanner;
 public class Digits{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in); 

int number = 0;
int sum = 0;
for(int count=1; count<6; count++){

  System.out.print("Enter a number:");
   number = scanner.nextInt();
   sum = sum + number;
  }
  
 System.out.printf("The sum of all number is %d",sum);
 }
}