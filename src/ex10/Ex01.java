package ex10;

//4번
public class Ex01 {
    void init(double[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }
    }

    public static void main(String[] args) {
        double[] values = { 1.2, 3.3, 6.7 };
        Ex01 a = new Ex01();
        a.init(values);
        for (double value : values) {
            System.out.println(value);
        }
    }
}
