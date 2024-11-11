import java.util.Scanner;
public class Vote{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

  System.out.print("Enter your age:");
  int age = scanner.nextInt();

if(age >= 21){
 System.out.print("Drink");
 }
 else if(age >= 18 ){
  System.out.print("Vote");
 }
 else {
  System.out.print("Drive");
 }
 }
}