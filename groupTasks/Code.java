import java.util.Random;
import java.util.Scanner; 
public class Code{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 Random random = new Random().nextInt(4);

System.out.print("Enter a number:");
 int number = random.nextInt();
if(number == random){
 System.out.print("Correct");
 }
  }
}