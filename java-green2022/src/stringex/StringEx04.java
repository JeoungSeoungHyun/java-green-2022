package stringex;

import java.util.Scanner;

class User {
    private String name;
    private String tell;
    private char gender;
    private int age;

    public User(String name, String tell, char gender, int age) {
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

public class StringEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in(키보드 논리적 연결)(바이트 스트림) 생성자
        // A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20
        // String data = sc.nextLine();
        String data = "A01-이름:홍길동-전화번호:0102222-성별:남-나이: 20"; // 라고 넣어서 test하고 나중에 바꾸면 된다.

        String[] tokens = data.split("-"); // 여기까지 진행되는지 확인해보고 넘어간다. 막진행하면 나중에 뭐가 잘못된지 모르게된다.
        // System.out.println(tokens[0]);
        // System.out.println(tokens[1]);
        // System.out.println(tokens[2]);
        // System.out.println(tokens[3]);
        // System.out.println(tokens[4]);

        if (tokens[0].equals("A01")) { // 문자열은 == 으로 비교하지마라 위험하다. 값인지 주소인지 몰라
            // 1. 이름:홍길동 을 : 으로 구분해서 홍길동을 찾자
            // System.out.println(tokens[1]); 처리해야 하는 로직이 맞는지 확인하자.
            String name = tokens[1].split(":")[1];

            // 2. 전화번호:0102222 을 : 으로 구분해서 0102222를 찾자.
            String tell = tokens[2].split(":")[1]; // int로 바꿔버리면 맨 앝에 0이 날아가므로 String으로 남겨둔다.
            // 1번을 확인했으면 다를게 없으니 굳이 확인 안해도 된다.

            // 3. 성별:남 을 : 으로 구분해서 남을 찾자.
            String genderTemp = tokens[3].split(":")[1];

            // 4. 나이: 20 을 : 으로 구분해서 20을 찾자.
            String ageTemp = tokens[4].split(":")[1];

            // 5. 일단 String오로 다 받아서 맞는 타입으로 형변환(캐스팅) 해준다.
            char gender = genderTemp.charAt(0);
            String ageTrim = ageTemp.trim();

            int age = Integer.parseInt(ageTrim);
            // 6. 패턴이 보면이 for문으로 바꿔주기

            // 7. 클래스에 담기
            User user = new User(
                    name,
                    tell,
                    gender,
                    age);

            System.out.println("end if"); // 디버깅 용 출력라인
        } else {
            System.out.println("프로그램종료");
        }
    }
}