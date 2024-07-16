
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the STring to reverse: ");
        String str = sc.next();
        System.out.println("Reversed string of " + str + " is: " + reverse(str));
    }
}

    public static String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null is not a valid input");
        }

        StringBuilder reversedString = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString.append(charArray[i]);
        }
        return reversedString.toString();
    }
}
