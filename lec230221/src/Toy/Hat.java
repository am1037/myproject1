package Toy;

public class Hat implements Item{
    @Override
    public boolean consume() {
        System.out.println("모자는 먹을 수 없다");
        return false;
    }

    @Override
    public boolean use() {
        equip();
        return false;
    }

    @Override
    public boolean equip() {
        System.out.println("모자를 썼다.");
        return false;
    }
}
