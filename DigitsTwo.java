import java.util.Scanner;
 public class DigitsTwo{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in); 

int number = 0;
int sum = 0;

int count=1; 
while(count<6){

  System.out.print("Enter a number:");
   number = scanner.nextInt();
   sum = sum + number;
   count++;
  }
  
 System.out.printf("The sum of all number is %d",sum);
 }
}