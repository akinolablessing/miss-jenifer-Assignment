import java.util.Scanner;
public class Course{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.println("Select One course\n 1.Math \n 2.Science \n 3.History");
int course = scanner.nextInt();
 
switch(course){
  case 1:
    System.out.println("1.FreshMan\n2.Sophomore\n3.Junior\n4.Senior");
     int math = scanner.nextInt();

      switch(math){
       case 1:
        System.out.print("Math freshman...");
        break;
       case 2:
        System.out.print("Math Sophomore...");
        break;
       case 3:
        System.out.print("Math Junior...");
        break;
       case 4:
        System.out.print("Math Senior...");
        break;

      }
    break;
   case 2:
    System.out.println("1.FreshMan\n2.Sophomore\n3.Junior\n4.Senior");
     int science = scanner.nextInt();
      switch(science){
       case 1:
        System.out.print("Science freshman...");
        break;
       case 2:
        System.out.print("Science Sophomore...");
        break;
       case 3:
        System.out.print("Science Junior...");
        break;
       case 4:
        System.out.print("Science Senior...");
        break;

     }
    break;
   case 3:
    System.out.println("1.FreshMan\n2.Sophomore\n3.Junior\n4.Senior");
     int history = scanner.nextInt();
      switch( history){
       case 1:
        System.out.print("history freshman...");
        break;
       case 2:
        System.out.print("histoy Sophomore...");
        break;
       case 3:
        System.out.print("history Junior...");
        break;
       case 4:
        System.out.print("history Senior...");
        break;

     }
    break;

}
}
}