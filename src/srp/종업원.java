package srp;

//종업원 -> 요리사(의존성)
public class 종업원 {

    public 음식 주문받기(요리사 chef) {
        chef.음식생성();
        음식 food = chef.음식생성();
        return food; // null 아무것도 없음.
    }
}
