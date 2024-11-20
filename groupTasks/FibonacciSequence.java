import java.util.Scanner;
public class FibonacciSequence{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

for(int count=0; count<=number; count++){
 System.out.print(count+" ");
 }
 }
}