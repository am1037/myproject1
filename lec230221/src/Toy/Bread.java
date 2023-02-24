package Toy;

public class Bread implements Item{
    @Override
    public boolean consume() {
        System.out.println("냠냠");
        return false;
    }

    @Override
    public boolean use() {
        consume();
        return false;
    }

    @Override
    public boolean equip() {
        System.out.println("빵은 입을 수 없다.");
        return false;
    }
}
