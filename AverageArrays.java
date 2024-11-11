import java.util.Scanner;
import java.util.Arrays;
public class AverageArrays{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
  int[] numbers = new int[5];
  int sum = 0;
  int average = 0;
  for(int count=0; count<numbers.length; count++){
   System.out.print("Enter a number:");
    numbers[count] = scanner.nextInt();
    sum = sum + numbers[count];
    average = sum / 5;
   
  }
System.out.printf("The average of all numbers is: %d",average);
 }
}