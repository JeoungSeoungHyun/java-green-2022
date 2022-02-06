package practice;

import java.util.Scanner;

class Information {
    private String name;
    private String tell;
    private char gender;
    private int age;

    public Information(String name, String tell, char gender, int age) {
        this.name = name;
        this.tell = tell;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StringTest {
    static String[][] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();

        // String name;
        // String tell;
        // char gender;
        // int age;
        String[][] tokensInfo = new String[4][2];

        String[] tokens = info.split("-");

        if (tokens[0].equals("A01")) {
            for (int i = 1; i < tokens.length; i++) {
                // System.out.println(tokens[i]);
                tokensInfo[i - 1] = tokens[i].split(":");
                // System.out.println(tokensInfo[i - 1][0]);
                // System.out.println(tokensInfo[i - 1][1]);
                // if (i == 1) {
                // name = tokensInfo[1];
                // System.out.println(name);
                // } else if (i == 2) {
                // tell = tokensInfo[1];
                // System.out.println(tell);
                // } else if (i == 3) {
                // gender = tokensInfo[1].charAt(0);
                // System.out.println(gender);
                // } else if (i == 4) {
                // age = Integer.parseInt(tokensInfo[1].trim());
                // System.out.println(age);
                // }
            }
            String name = tokensInfo[0][1];
            System.out.println(name);
            String tell = tokensInfo[1][1];
            System.out.println(tell);
            char gender = tokensInfo[2][1].charAt(0);
            System.out.println(gender);
            int age = Integer.parseInt(tokensInfo[3][1].trim());
            System.out.println(age);
            // String[] tokenName = tokens[1].split(":");
            // String[] tokenTell = tokens[2].split(":");
            // String[] tokenGender = tokens[3].split(":");
            // String[] tokenAge = tokens[4].split(":");

            // Information doc1 = new Information(name, tell, gender, age);

            // System.out.println("이름 :" + doc1.getName() + " /전화번호 :" + doc1.getTell() + "
            // /성별 :" + doc1.getGender()
            // + " /나이 :" + doc1.getAge());
        }

        // Information doc1 = new Information(name, tell, gender, age);
    }

}
// 배열의 주소와 값 구분하기 어떤경우에 값이 나오고 어떤경우엔 주소가 나오고