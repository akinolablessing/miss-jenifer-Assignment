import java.util.Scanner;
 public class TwoLargestNumber{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   int largest = 0;
    int secondLargest =0;
    int numberCounter=1;
      
  
   while(numberCounter <= 10){
    System.out.print("Enter a number:");
     int number = scanner.nextInt();
     numberCounter++;

     if (number > largest){
       secondLargest=largest;
       largest = number;
      }
      else if(number > secondLargest){
       secondLargest=number;
       
    }
   }
    System.out.printf("Largest value is %d  and %d ", largest,secondLargest); 
   }
  }