
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the String: ");
            String str=sc.next();
            boolean Palin=isPalindrome(str);
            System.out.print((Palin)?"The String is Palindrome":"The String is not a palindrome");
        }
    }
        public static boolean isPalindrome(String str){
            boolean res=true;
            int length=str.length();
            for(int i=0;i<length/2;i++){
                if(str.charAt(i)!=str.charAt(length-i-1)){
                    res=false;
                    break;
                }
            }
            return res;
        
    }
}