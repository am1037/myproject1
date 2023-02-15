package classTest;

public class Phone {
    int price;
    String name;

    public Phone(int price, String name) {
        this.price=price;
        this.name=name;
    }

    void printSpec () {
        System.out.println("이름은 " + name);
        System.out.println("가격은 " + price);
    }
}
