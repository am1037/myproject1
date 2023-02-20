package Forest;

public class Animal {
    int x_Loc;
    int size;

    public Animal(int x_Loc) {
        this.x_Loc = x_Loc;
    }

    public void Walk(int x_d, int y_d) {
        x_Loc++;
        System.out.println("현재 위치는 "+x_Loc+"입니다.");
    }

    public void eat() {
    }
}
