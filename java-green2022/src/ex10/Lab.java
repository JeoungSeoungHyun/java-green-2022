package ex10;

//LAB
import java.util.Scanner;

class Employee {
    String name;
    String address;
    int sal;
    int phoneNumber;

    String getter() {
        return "이름 : " + name + " 주소 : " + address + " 연봉 : " + sal + " 전화 번호 : " + phoneNumber;
    }

    void setter(String name, String address, int sal, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.sal = sal;
        this.phoneNumber = phoneNumber;
    }
}

public class Lab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employee = new Employee[3];
        for (int i = 0; i < employee.length; i++) {
            System.out.println("이름을 입력하세요");
            String name = scan.next();
            System.out.println("주소를 입력하세요");
            String address = scan.next();
            System.out.println("연봉을 입력하세요");
            int sal = scan.nextInt();
            System.out.println("전화번호를 입력하세요");
            int phone = scan.nextInt();
            employee[i] = new Employee();
            employee[i].setter(name, address, sal, phone);
            System.out.println("=========================");
        }
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getter());
        }
    }
}
