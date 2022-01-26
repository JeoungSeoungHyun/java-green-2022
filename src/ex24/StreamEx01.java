package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다.
        // 한 문자씩만 보낼 수 있다.
        InputStream s = System.in;
        int n;

        try {
            n = s.read();
            System.out.println((char) n);
        } catch (IOException e) {
            System.out.println("에러");
        }
    }
}
