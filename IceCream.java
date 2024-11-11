import java.util.Scanner;
public class IceCream{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.println("Ice Cream Menu:\n1.Ice cream \n2.Sundae \n3.Shake");
int cream = scanner.nextInt();
 
switch(cream){
  case 1:
    System.out.println("1.Chocolate \n2.Vanilla \n3.Strawberry");
    int iceCream = scanner.nextInt();
     switch(iceCream){
      case 1:
        System.out.print("Chocolate ice cream..");
        break;
     case 2:
       System.out.print("Vanilla ice cream..");
       break;
     case 3:
      System.out.print("Strawberry ice cream..");
      break;


     }
    break;
  case 2:
    System.out.println("1.Chocolate \n2.Vanilla \n3.Strawberry");
    int sundae = scanner.nextInt();
     switch(sundae){
      case 1:
        System.out.print("Chcolate sundae..");
        break;
     case 2:
        System.out.print("Vanilla sundae..");
        break;
     case 3:
        System.out.print("Strawberry sundae..");
        break;
      }
    break;
  case 3:
    System.out.println("1.Chocolate \n2.Vanilla \n3.Strawberry");
     int shake = scanner.nextInt();
     switch(shake ){
      case 1:
        System.out.print("Chocolate shake...");
        break;
     case 2:
       System.out.print("Vanilla shake...");
       break;
     case 3:
       System.out.print("Strawberry shake..");
       break;
     }
    break;

}
}
}