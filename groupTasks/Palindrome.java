import java.util.Scanner;
public class Palindrome{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter anything of your choice:");
int numbers = scanner.nextInt();


if(numbers %2 ==1){
 System.out.println("It is palindrome");
  }

 else{
  System.out.println("It is not a palidrome ");
   }
System.out.print("Enter anything of your choice:");
String words = scanner.next();
 
if(words.equals("hello")){
System.out.print("It is not a palindrome");
 }
 else{
  System.out.print("It is a palindrome");
}
   }
}

