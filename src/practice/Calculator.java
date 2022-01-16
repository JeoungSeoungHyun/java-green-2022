package practice;

import java.util.Scanner;

class Calculate {

    double add(double a, double b) {
        return a + b;
    }

    double minus(double a, double b) {
        return a - b;
    }

    double multi(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double reverse(double a) {
        return a * (-1);
    }

    double reciprocal(double a) {
        return 1 / a;
    }

    double squared(double a) {
        return a * a;
    }

}

public class Calculator {
    public static void main(String[] args) {

        double value1 = 0;
        double value2 = 0;
        int checkNum = 0;
        double memory = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);
            String cal;
            double store;

            Calculate c = new Calculate();
            if (checkNum == 0) {
                System.out.println("값을 입력하세요");
                value1 = sc.nextInt();
                checkNum++;
            }
            System.out.println(checkNum);
            System.out.println("첫 번째 값 : " + value1);
            System.out.println("원하는 연산을 입력하세요.( + , - , * , / , +/- , C , 1/x , x^2 , MR , MC , M+, M-)");
            cal = sc.next();
            if (cal == "초기화") {
                checkNum = 0;
            } else if (cal == "+/-") {
                value1 = c.reverse(value1);
                System.out.println(value1);
            } else if (cal == "1/x") {
                value1 = c.reciprocal(value1);
                System.out.println(value1);
            } else if (cal == "x^2") {
                value1 = c.squared(value1);
                System.out.println(value1);
            } else if (cal == "MR") {
                System.out.println(memory);
            } else if (cal == "MC") {
                memory = 0;
            }

        }

    }
}
