import java.util.Scanner;
  public class Largest_Smallest{
   public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  int first_number = 0;
  int second_number = 0;
  String ques = "";

  do{
   System.out.print("Enter a number:");
   first_number = scanner.nextInt();

  System.out.print("Enter a number:");
  second_number = scanner.nextInt();
 
if (first_number >= second_number){
System.out.printf("The largest number is:%d%n",first_number);

 }
if (first_number <= second_number){
System.out.printf("The smallest number is:%d%n",first_number);

 }
if (second_number<= first_number ){
System.out.printf("The smallest number is:%d%n",second_number);

 }
if (second_number>= first_number ){
System.out.printf("The largest number is:%d%n",second_number);

 }
System.out.print("Would you like to perform another one?");
ques = scanner.next();


 }while(ques.equals("yes"));
  }
 }