package stringex.practice;

public class Test07 {
    public static void main(String[] args) {
        String str = "A*B*C*D";
        String replace = str.replace("*", "-");
        System.out.println("replace: " + replace);
    }
}
