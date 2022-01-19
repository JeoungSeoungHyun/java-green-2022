package stringex;

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

public class StringEx03 {
    public static void main(String[] args) {
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20
        // 파싱하여 클래스에 저장
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        String[] info = data.split("-");

        if (info[0].equals("A01")) {
            String[][] infoTokens = new String[info.length][2]; // 이중배열 사용 파싱

            for (int i = 1; i < info.length; i++) {
                infoTokens[i - 1] = info[i].split(":");
            }

            String name = infoTokens[0][1];
            String tell = infoTokens[1][1];
            char gender = infoTokens[2][1].charAt(0);
            int age = Integer.parseInt(infoTokens[3][1].trim());

            Information doc1 = new Information(name, tell, gender, age);

            System.out.println(doc1.getName() + "님의 정보입니다.  전화번호 :"
                    + doc1.getTell() + " /성별 :" + doc1.getGender() + " /나이 :"
                    + doc1.getAge() + "세");
        }
    }
}
