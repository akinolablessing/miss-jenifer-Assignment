public class Even{
 public static void main(String[] args){

int sum=0;
for(int count=0; count<=10; count+=2){
  System.out.println(count);
  sum=sum+count;
}
 
System.out.printf("The sum is %d",sum); 
 }
}