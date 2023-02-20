package DecoratorTest;

public class NormalCar implements Car {
    @Override
    public void assemble(){
        System.out.println("평범한 자동차입니다.");
    }
    @Override
    public void run(){
        System.out.println("부릉부릉");
    }
}
