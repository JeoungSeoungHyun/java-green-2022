package data00;

public class Test3 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

        System.out.println("a의 주소 : " + System.identityHashCode(a));
        System.out.println("b의 주소 : " + System.identityHashCode(b));

        b = b + "!";

        System.out.println("변경 후 a의 주소 : " + System.identityHashCode(a));
        System.out.println("변경 후 b의 주소 : " + System.identityHashCode(b));
        System.out.println("c2 : " + System.identityHashCode(new String("hello")));
        System.out.println("d2 : " + System.identityHashCode(new String("hello")));

        System.out.println("a : " + a.hashCode());
        System.out.println("b : " + b.hashCode());
        System.out.println("c : " + new String("hello").hashCode());
        System.out.println("d : " + new String("hello").hashCode());
    }
}
