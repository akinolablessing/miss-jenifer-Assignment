import java.util.Scanner;
public class rank{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a rank (1, 2, 3, or 4):");
int number = scanner.nextInt();
 
switch(number){
  case 1:
    System.out.print("Gold Medal");
    break;
  case 2:
    System.out.print("Silver Medal");
     break;
   case 3:
    System.out.print("Bronze Medal");
     break;
  case 4:
    System.out.print("Participant Ribbon");
    break;
   }
 }
}