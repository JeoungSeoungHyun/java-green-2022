package ex05;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println((x == 3) && (y == 7)); // ()안부터 연산되고 왼쪽부터 연산된다 &&(AND)는 직렬
        System.out.println((x == 3) || (y == 4)); // ||(OR)은 병렬
    }
}
