package ex00;

// 오버로딩 = over-loading(과적재)

/**
 * 1. 메서드는 동일한 이름으로 만들 수 없다.
 * 2. 단 매개변수의 타입이 다르거나, 위치가 다르거나, 개수가 다르면 다른 메서드로 인식
 * 3. 개발자 입장에서 함수이름을 하나만 기억하면 된다.
 * 4. 경우의 수가 너무 많아지면 퇴사하고 싶어진다. 너무 많은 메서드가 필요하다.
 * 5. 어떨 때 사용하면 되나? 개수가 적을 때! 20개만! 10개만!
 * 6. 추상화를 통하면 메서드를 하나로 만들 수 있게 된다! (상속 / 다형성)
 */
class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자가 호랑이 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 " + unit1.name + "에게 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp" + unit2.hp);
        System.out.println();
    }

    // 사자가 곰 공격
    static void attackLionToBear(사자 unit1, 곰 unit2) {
        System.out.println(unit2.name + "이 " + unit1.name + "에게 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp" + unit2.hp);
        System.out.println();
    }

    // 호랑이가 곰 공격
    static void attackTigerToBear(호랑이 unit1, 곰 unit2) {
        System.out.println(unit2.name + "이 " + unit1.name + "에게 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp" + unit2.hp);
        System.out.println();
    }

    // 호랑이가 사자 공격
    static void attackTigerToLion(호랑이 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 " + unit1.name + "에게 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp" + unit2.hp);
        System.out.println();
    }

    // 곰이 호랑이 공격
    static void attackBearToTiger(곰 unit1, 호랑이 unit2) {
        System.out.println(unit2.name + "가 " + unit1.name + "에게 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp" + unit2.hp);
        System.out.println();
    }

    // 곰이 사자 공격
    static void attackBearToLion(곰 unit1, 사자 unit2) {
        System.out.println(unit2.name + "가 " + unit1.name + "에게 공격당하고 있습니다");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp" + unit2.hp);
        System.out.println();
    }

    public static void main(String[] args) {
        사자 u1 = new 사자();
        호랑이 u2 = new 호랑이();
        곰 u3 = new 곰();

        // 곰이 사자 공격
        attackBearToLion(u3, u1);
        // 곰이 호랑이 공격
        attackBearToTiger(u3, u2);
        // 사자가 곰 공격
        attackLionToBear(u1, u3);
        // 사자가 호랑이 공격
        attackLionToTiger(u1, u2);
        // 호랑이가 곰 공격
        attackTigerToBear(u2, u3);
        // 호랑이가 사자 공격
        attackTigerToLion(u2, u1);
        // 메서드 이름이 같은데 argument가 다르기 때문에 맞춰서 실행
        // System.out.println(1);
        // System.out.println(1.0);
        // System.out.println(true);

    }
}
