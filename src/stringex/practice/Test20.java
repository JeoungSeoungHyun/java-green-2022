package stringex.practice;

// 빅데이터를 모을 수 있다. 쿼리스트링에 000000000001 이런 숫자를 증가시키면서 스크랩하기 위해 
public class Test20 {
    public static void main(String[] args) {
        int i = 123456789;
        String str = String.format("%d", i);
        System.out.println("format: " + str);
        String money = "123456";
    }
}