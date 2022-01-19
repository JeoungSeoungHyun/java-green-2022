package stringex;

import java.util.Scanner;

public class StringEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();

        String[] tokensInfo = info.split("-");
        if (tokensInfo[0].equals("A01")) {
            for (int i = 1; i < tokensInfo.length; i++) {
                String[] tokensInfoDetail = tokensInfo[i].split(":");
            }
            // for (i){

        }
    }
}
