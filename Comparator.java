import java.util.Scanner;
  public class Comparator{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

      int zero=0;
      int minus=-1;
      int one=1;
     System.out.print("Enter first number");
      int first_number = scanner.nextInt();

     System.out.print("Enter second number:");
      int second_number = scanner.nextInt();
    
     if (first_number==second_number ){
         System.out.printf("%d",zero);
    }  
    if (first_number>second_number ){
       System.out.printf("%d",one);
    }
    if (second_number>first_number){
       System.out.printf("%d",minus);
    }
   }
  }