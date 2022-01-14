package ex11;

abstract class 동물 {
    String name;
    int hp;
    int attack;

    int returnHp() {
        return hp;
    }

    int returnAttack() {
        return attack;
    }

    String returnName() {
        return name;
    }

    void changeHp(int replace) {
        hp = replace;
    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    int returnHp() {
        return hp;
    }

    int returnAttack() {
        return attack;
    }

    String returnName() {
        return name;
    }

    void changeHp(int replace) {
        hp = replace;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    int returnHp() {
        return hp;
    }

    int returnAttack() {
        return attack;
    }

    String returnName() {
        return name;
    }

    void changeHp(int replace) {
        hp = replace;
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    int returnHp() {
        return hp;
    }

    int returnAttack() {
        return attack;
    }

    String returnName() {
        return name;
    }

    void changeHp(int replace) {
        hp = replace;
    }
}

public class ExtendsEx02 {

    static void attack(동물 unit1, 동물 unit2) {
        System.out.println(unit2.returnName() + "가 " + unit1.returnName() + "에게 공격당하고 있습니다.");
        int hp = unit2.returnHp() - unit1.returnAttack();
        unit2.changeHp(hp);
        System.out.println(unit2.returnName() + "의 hp : " + unit2.returnHp());
    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();

        // 사자가 호랑이 공격
        attack(lion, tiger);
        // 곰이 호랑이 공격
        attack(bear, tiger);
        // 사자가 곰 공격
        attack(lion, bear);
        // 곰이 사자 공격
        attack(bear, lion);
        attack(bear, lion);
    }
}