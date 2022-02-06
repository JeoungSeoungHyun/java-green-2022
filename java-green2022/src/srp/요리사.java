package srp;

public class 요리사 {
    // 요리사는 누구와도 협력하지 않는다. 의존적이지 않다.
    public 음식 음식생성() {
        음식 food = new 음식("짜장면");
        return food;
    }
}
