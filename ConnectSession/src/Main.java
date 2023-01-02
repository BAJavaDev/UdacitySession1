public class Main {
    public static void main(String[] args) {

        final String str1 = "udacity";
        final String str2 = "udacity";
        final String str3 = new String("udacity");


        System.out.println("case 1: " + str2.equals(str1));
        System.out.println("case 2: " + (str1==str2));
        System.out.println("case 4: " + str3.equals(str2));
        System.out.println("case 1: " + (str2==str3));
    }

    private static boolean equalsComparison(String str1, String str2){
        return str1 == str2;
    }

    private static boolean equalsKeyword(String str1, String str2) {
        return str1.equals(str2);
    }

}