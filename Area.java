import java.util.Scanner;
public class Area{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 
System.out.println("Type of shape:\n1.Circle \n2.Rectangle \n3.Triangle");
int shape = scanner.nextInt();

switch(shape){
 case 1:
   System.out.println("Do you want to enter a value by yourself(yes or no):");
    String circle = scanner.next();
     switch(circle){
       case "yes":
                  
     System.out.print("Enter number of a radius: ");
     double radius = scanner.nextDouble();
      double sum = 3.14*radius*radius;
       System.out.printf("The sum of area of triangle is %.2f",sum);
         break;
      case "no":
         double radi = 3;
        double summ = 3.14*radi*radi;
       System.out.printf("The sum of area of triangle is %.2f",summ);
        break;
        }
   break;
case 2:
  System.out.println("Do you want to enter a value by yourself(yes or no):");
   String lenght = scanner.next();
     switch(lenght){
       case "yes":
                     
     System.out.print("Enter number of a base: ");
     double base = scanner.nextDouble();
      System.out.print("Enter number of a height: ");
     double height = scanner.nextDouble();

      double baseHeight = 0.5*base*height;
       System.out.printf("The sum of area of Rectangle is %.2f",baseHeight);
         break;
      case "no":
       double baseTwo = 6;
        double heightTwo =  4;
        double baseTwoheightTwo = 0.5 * baseTwo * heightTwo;
       System.out.printf("The sum of area of triangle is %.2f",baseTwoheightTwo);
        break;

      }
   break;
case 3:
  System.out.println("Do you want to enter a value by yourself(yes or no):");
  String width = scanner.next();
     switch(width){
       case "yes":
        System.out.print("Enter number of a lenght: ");
      double lenghtt = scanner.nextDouble();
        System.out.print("Enter number of a brenth: ");
      double brenth = scanner.nextDouble();

      double add = lenghtt * brenth;
       System.out.printf("The sum of area of triangle is %.2f",add);
         break;
     case "no":
         double l = 6;
        double b =  4;
        double s = l*b;
       System.out.printf("The sum of area of triangle is %.2f",s);
        break;

       }
   break;
}
}
}
