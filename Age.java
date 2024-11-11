import java.util.Scanner;
public class Age{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter your age:");
 int stage = scanner.nextInt();

  if(stage > 65){
    System.out.print("Senior");
}
 else if(stage >=0 && stage <= 12){
  System.out.print("Child");
 }
 else if(stage >=13 && stage <= 17){
  System.out.print("Teen");
 }
 else if(stage >=18 && stage <= 64){
  System.out.print("Adult");
 }



 }
}