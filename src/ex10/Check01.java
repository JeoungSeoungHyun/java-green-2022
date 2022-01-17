package ex10;

import java.util.Scanner;

//평균성적
public class Check01 {

    static void getValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하세요 : ");
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }
    }

    static void getAverage(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("평균 성적은" + total / array.length + "입니다.");
    }

    public static void main(String[] args) {
        int stundents = 5;
        int[] scores = new int[stundents];
        getValues(scores);
        getAverage(scores);

    }
}