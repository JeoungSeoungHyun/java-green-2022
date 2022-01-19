package ex12;

import javax.net.ssl.KeyManager;

interface Keymap {
    public abstract void q();

    public abstract void w();

    public abstract void e();

    public abstract void r();
}

class 알리스타 implements Keymap {

    @Override
    public void q() {
        System.out.println("띄우기");

    }

    @Override
    public void w() {
        System.out.println("밀기");

    }

    @Override
    public void e() {
        System.out.println("스턴");

    }

    @Override
    public void r() {
        System.out.println("방어력증가");

    }

}

class 티모 implements Keymap {

    @Override
    public void q() {
        System.out.println("실명");

    }

    @Override
    public void w() {
        System.out.println("이속증가");

    }

    @Override
    public void e() {
        System.out.println("독침 발사");

    }

    @Override
    public void r() {
        System.out.println("버섯 폭탄 생성");

    }

}

public class TestEx01 {
    public static void main(String[] args) {
        Keymap u1 = new 알리스타();
        Keymap u2 = new 티모();
        u1.q();
        u2.q();
    }
}
