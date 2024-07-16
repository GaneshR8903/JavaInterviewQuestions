
import java.util.Scanner;

public class SwapValues {
    private int a;
    private int b;
    public SwapValues(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void swap() {
        b=b+a;
        a=b-a;
        b=b-a;
    }
    public void displayValues(){
        System.out.print("Values after Swapping a:"+a+",b:"+b);
    }
    public static void main(String[] args) {
        
    try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter 2 values to swap: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        SwapValues swap=new SwapValues(a,b);
        swap.swap();
        swap.displayValues();
    }
}
}
