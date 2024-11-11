import java.util.Scanner;
public class Department{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.println("Select department\n 1.IT \n 2.HR \n 3.Finance");
int number = scanner.nextInt();
 
switch(number){
   case 1:
     System.out.println("select one:\n1.Manager\n2.Analyst\n3.Intern");
     int manager = scanner.nextInt();
  
 switch(manager){
   case 1:
     System.out.print("Welcome to IT manager...");
   break;
   case 2:
    System.out.print("Welcome to IT Analyst ...");
    break;
   case 3:
      System.out.print("Welcome to IT Intern ...");
     break;
 }
    break;
   case 2:
   System.out.println("select one:\n1.Manager\n2.Analyst\n3.Intern");
     int analyst  = scanner.nextInt();
    switch(analyst){
      case 1:
        System.out.print("Welcome to HR Manager...");
         break;
      case 2:
        System.out.print("Welcome to HR Analyst...");
         break;
      case 3:
        System.out.print("Welcome to HR Intern...");
        break;
   }
   break;
     case 3:
      System.out.println("select one:\n1.Manager\n2.Analyst\n3.Intern");
     int intern  = scanner.nextInt();
    switch(intern){
      case 1:
        System.out.print("Welcome to finance Manager...");
         break;
      case 2:
        System.out.print("Welcome to  finance Analyst...");
         break;
      case 3:
        System.out.print("Welcome to HR  finance Intern...");
        break; 
  }
  }
 }
}