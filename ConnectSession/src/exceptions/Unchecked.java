package exceptions;

public class Unchecked {
    public static void main(String[] args) {
        System.out.println(concatStrs("ham", "burger"));
        System.out.println(concatStrs("chilly", "fries"));
        System.out.println(concatStrs(null, "phone"));
    }

    public static String concatStrs(String str1, String str2) {
        return str1.toLowerCase() + str2.toLowerCase();
    }
}
