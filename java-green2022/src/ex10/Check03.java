package ex10;

//배열에 객체 참조변수 값 담기
class Car {
    int speed;
    int gear;
    String color;

    // 생성자 통한 초기화
    Car() {
        speed = 0;
        gear = 1;
        color = "red";
    }

    void speedUp() {
        speed += 10;
    }

    public String toString() {
        return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
    }
}

public class Check03 {
    public static void main(String[] args) {
        int numCars = 5;
        Car[] cars = new Car[numCars];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }
        for (int i = 0; i < cars.length; i++) {
            cars[i].speedUp();
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
