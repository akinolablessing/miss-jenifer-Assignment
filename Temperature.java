import java.util.Scanner;
public class Temperature{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a temperature in census:");
int census = scanner.nextInt();

 if(census < 10){
  System.out.print("Cold");
}
else if(census >= 10 && census <= 12){
  System.out.print("Warm");
}
else if(census > 25){
  System.out.print("Hot");
}

 }
 }