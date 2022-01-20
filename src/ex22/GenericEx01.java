package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

class ResponseBox<T> {// T는변수다
    T data; // 박스 class에 콤포지션하면 generic을 이용하여 return타입을 고정시켜 줄 수 있다.

    public ResponseBox(T data) {
        this.data = data;
    }

}

// 제네릭을 사용하면 메서드의 리턴 타입을 고정 시키면서 다양하게 리턴할 수 있다.
public class GenericEx01 {
    public static void main(String[] args) {
        ResponseBox<사과> rb = new ResponseBox<사과>(new 사과()); // 바로 집어넣는 거 가능 new 사과()
        // rb 응답!!
        System.out.println(rb.data.name);
        ResponseBox<딸기> rs = new ResponseBox<딸기>(new 딸기()); // 뒤에 <>안은 생략가능
        // rs 응답!!
        System.out.println(rs.data.name);
        ResponseBox<오렌지> ro = new ResponseBox<오렌지>(new 오렌지());
        // ro 응답!!
        System.out.println(ro.data.name);
    }

}
