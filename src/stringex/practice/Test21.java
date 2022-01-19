package stringex.practice;

public class Test21 {
    public static void main(String[] args) {
        int i = 123456;
        String str1 = String.format("%,d", i);
        String str2 = "123456";
        boolean matches = str1.matches(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("matches: " + matches);
    }
}
