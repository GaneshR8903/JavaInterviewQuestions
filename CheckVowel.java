

public class CheckVowel {
    public static void main(String[] args) {
        System.out.println(stringContainsVowel("Ganesh"));
        System.out.println(stringContainsVowel("12356"));
    }
    public static boolean stringContainsVowel(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
