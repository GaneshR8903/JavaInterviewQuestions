
import java.util.Scanner;

public class FibonacciSeries{
     public static int Fibonacci(int count){
          if(count<=1){
               return count;
          }
          return Fibonacci(count-1)+Fibonacci(count-2);
     }
     public static void main(String[] args) {
          try(Scanner sc=new Scanner(System.in)){
          System.out.print("Enter the length of fibonacci Sequence: ");
          int length=sc.nextInt();
          System.out.print("A fibonacci Sequence upto length "+length+" are:");
          for(int i=0;i<length;i++){
               System.out.print((i<length-1)?(Fibonacci(i)+","):Fibonacci(i));
          }
     }
}
}