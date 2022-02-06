package ex11;

// 패턴 -> 디자인 패턴 -> 설계도를 패턴으로 만들까? -> 누구나 똑같이 만들 수 있다.
class 튜브 {
    private static 튜브 instance = new 튜브();

    private 튜브() {
    }

    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }

    // 접근 불가하게 없애준다
    // public static void setInstance(튜브 instance) {
    // 튜브.instance = instance;
    // }

}

// 싱글톤 패턴 :객체를 하나만 만드는
public class SingleEx01 {
    // 1. 튜브를 new하여서 계속 만들지 못하도록 생성자에 private를 붙인다. private 붙는 순간 SingleEx01클래스는 튜브
    // 생성자를 찾을 수 없으므로 튜브를 new할 수 없게된다.
    // 2. 튜브를 만들기 위해 static 튜브 변수 = new 튜브(); 라고 띄워준다.
    // 3. 이것도 변수이기 때문에 private을 붙여준다
    // 4. 이 변수를 또 직접 알 수 없기 때문에 get메서드를 하나 만들어서 return받는다. 물론 이 메서드도 static으로 띄워놓아야
    // 알수있다.
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
