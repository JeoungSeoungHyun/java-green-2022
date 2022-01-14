package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if(조건) => 그게 아니라 이것이라면 가독성이 좋아진다 표현하기도 좋다
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점");
        } else if (point >= 80) { // point의 범위가 89 ~ 80이라면?이라는 조건
            System.out.println("B학점");
        } else if (point >= 70) { // point의 범위가 79 ~ 70이라면?이라는 조건
            System.out.println("C학점");
        } else if (point >= 60) { // point의 범위가 69 ~ 60이라면?이라는 조건
            System.out.println("D학점");
        } else { // point의 범위가 60미만이라면?이라는 조건
            System.out.println("F학점");
        }
    } // 메인 끝 이라고 표기해놓자 헷갈리면
}
