package srp;

//설계도
//요리사가 만들어야 할 책임이 있다.
public class 음식 { // getter setter 생성자
    private String name;

    public 음식(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
