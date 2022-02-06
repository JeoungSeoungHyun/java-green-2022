package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamEx02 {
    public static void main(String[] args) {
        // 한자리의 숫자를 받을 수 있다.
        InputStream in = System.in;
        // 직접 캐스팅 하지 않아도 알아서 문자로 바꿔준다.
        // 고정된 길이의 문자를 받을 수 있다.
        // 고정되어 있어 유실이나 낭비가 생긴다.
        InputStreamReader ir = new InputStreamReader(in);

        char[] data = new char[3];
        try {
            ir.read(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
