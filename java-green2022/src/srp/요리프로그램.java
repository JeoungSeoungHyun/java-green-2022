package srp;

public class 요리프로그램 {
    public static void main(String[] args) {
        // 만들 책임이 아무도 없어서 메인에서 개발자가 만든다.
        손님 customer = new 손님();
        종업원 manager = new 종업원();
        요리사 chef = new 요리사();

        // 누군가는 시작하기 위해 개발자가 시작해준다.
        customer.주문하기(manager, chef); // 손님과 요리사는 관계가 없지만 어쩔 수 없이 넘겨줘야 한다. new하지 않기 위해서 + 관계하기 때문에 넘겨준다.
    }
}
