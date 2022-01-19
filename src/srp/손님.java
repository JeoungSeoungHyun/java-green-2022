package srp;

// 손님 -> 종업원 관계해야한다.(의존성)
public class 손님 {
    // private int 배고픔; // 0~100

    // public void eat() {

    // }

    // 시작하기 위한 start 메서드
    public void 주문하기(종업원 manager, 요리사 chef) {
        음식 food = manager.주문받기(chef);
        System.out.println(food.getName() + "을 먹습니다.");
    }
}
